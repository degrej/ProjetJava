package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

import Controller.Console;
import Controller.Produit;

public class ModelProduit 
{
	private LinkedList<Produit> lesProduits;
	
	public static LinkedList<Produit> selectAll()
	{
		LinkedList<Produit> uneListe = new LinkedList<Produit>();
		String requete="Select * from produit;";
		try{
			Model unModel = new Model("localhost", "Jismen", "root", "");
			unModel.connexion();
			Statement unStat = unModel.getMaConnexion().createStatement();
			ResultSet unRes = unStat.executeQuery(requete);
			while(unRes.next())
			{
				int idProduit = unRes.getInt("idProduit");
				String Nom = unRes.getString("Nom");
				String Tag = unRes.getString("Tag");
				float Prix = unRes.getFloat("Prix");
				int Qte = unRes.getInt("Qte");
				Produit unProduit = new Produit(idProduit,Nom,Tag,Prix,Qte);
				uneListe.add(unProduit);
			}
			unRes.close();
			unStat.close();
			unModel.deconnexion();
		}
		catch(SQLException exp)
		{
			System.out.println("Erreur d'exécution de la requete "+requete);
		}
		return uneListe;
	}
	
	public static void ajouterProduit(Produit unProduit)
	{
		String requete="insert into produit (Nom, Tag, Prix)values('"+unProduit.getNom()+"','"+unProduit.getTag()+"','"+unProduit.getPrix()+"');";
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
		String nom = Console.saisirString("Donner le nom du produit");
		for(Produit unProduit:this.lesProduits)
		{
			if (nom.equals(unProduit.getNom()))
			{
				this.lesProduits.remove(unProduit);
				System.out.println("Produit supprimé");
				return;
			}
		}		
		System.out.println("Aucun produit avec ce nom.");
	}
	
	public void afficherProduitsACommander(int seuil)
	{
		System.out.println("Voici la liste des produits à commander:");
		for(Produit unProduit:this.lesProduits)
		{
			if (unProduit.getQte()<=seuil)
			{
				unProduit.afficher();
			}
		}
	}

}