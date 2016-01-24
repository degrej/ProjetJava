package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

import Controller.Console;
import Controller.Createur;
import Controller.Produit;

public class ModelCreateur 
{
	private LinkedList<Createur> lesCreateurs;

	public static LinkedList<Createur> selectAll() 
	{
		LinkedList<Createur> createurListe = new LinkedList<Createur>();
		String requete = "Select * from Createur;";
		try{
			Model unModel = new Model("localhost", "Jismen", "root", "");
			unModel.connexion();
			Statement unStat = unModel.getMaConnexion().createStatement();
			ResultSet unRes = unStat.executeQuery(requete);
			while(unRes.next())
			{
				String NomCreateur = unRes.getString("Createur");
				String Adresse = unRes.getString("Adresse");
				String CP = unRes.getString("Code Postal");
				String Ville = unRes.getString("Ville");
				Createur unCreateur = new Createur(NomCreateur,Adresse,CP,Ville);
				createurListe.add(unCreateur);
			}
			unRes.close();
			unStat.close();
			unModel.deconnexion();
		}
		catch(SQLException exp)
		{
			System.out.println("Erreur d'exécution de la requete "+requete);
		}
		return createurListe;
	}
	
	public static void ajouterCreateur(Createur unCreateur)
	{
		String requete ="insert Createur(NomCreateur,Adresse,CP,Ville) values('"+unCreateur.getNomCreateur()+"','"+unCreateur.getAdresse()+"','"+unCreateur.getCP()+"','"+unCreateur.getVille()+"') ;";
		try{
			Model unModel = new Model("localhost", "Jismen", "root", "");
			unModel.connexion();
			Statement unStat = unModel.getMaConnexion().createStatement();
			unStat.execute(requete);
			unStat.close();
			unModel.deconnexion();
		}
		catch(SQLException exp)
		{
			System.out.println("erreur d'execution de la requete "+ requete);
		}
	}
	
	public void supprimer()
	{
		String nom = Console.saisirString("Donner le nom du createur");
		for(Createur unCreateur:this.lesCreateurs)
		{
			if (nom.equals(unCreateur.getNomCreateur()))
			{
				this.lesCreateurs.remove(unCreateur);
				System.out.println("Createur supprimé");
				return;
			}
		}		
		System.out.println("Aucun createur avec ce nom.");
	}
}
