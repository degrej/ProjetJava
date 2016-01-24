package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

import Controller.Console;
import Controller.Couleur;

public class ModelCouleur 
{
	private LinkedList<Couleur> lesCouleurs;
	
	public static LinkedList<Couleur> selectAll()
	{
		LinkedList<Couleur> couleurListe = new LinkedList<Couleur>();
		String requete ="Select * from Couleur;";
		try{
			Model unModel = new Model("localhost", "Jismen", "root", "");
			unModel.connexion();
			Statement unStat = unModel.getMaConnexion().createStatement();
			ResultSet unRes = unStat.executeQuery(requete);
			while(unRes.next())
			{
				String NomCouleur = unRes.getString("Couleur");
				Couleur uneCouleur = new Couleur(NomCouleur);
				couleurListe.add(uneCouleur);
			}
			unRes.close();
			unStat.close();
			unModel.deconnexion();
		}
		catch(SQLException exp)
		{
			System.out.println("Erreur d'exécution de la requete "+requete);
		}
		return couleurListe;
	}
	
	public static void ajouterCouleur(Couleur uneCouleur)
	{
		String requete="insert into couleur (NomCouleur)values('"+uneCouleur.getNomCouleur()+"';";
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
	
	public void supprimer ()
	{
		String nomCouleur = Console.saisirString("Donner le nom de la couleur souhaité");
		for(Couleur uneCouleur:this.lesCouleurs)
		{
			if (nomCouleur.equals(uneCouleur.getNomCouleur()))
			{
				this.lesCouleurs.remove(uneCouleur);
				System.out.println("Couleur supprimé");
				return;
			}
		}		
		System.out.println("Aucun couleur avec ce nom.");
	}

}
