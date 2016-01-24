package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

import Controller.Console;
import Controller.Produit;
import Controller.Utilisateur;
import Model.Model;

public class ModelUtilisateur 
{
	// methode de vérification de la connexion
	public static String [] verifConnexion(String mail, String mdp)
	{
		String resultats [] = new String [3];
		String requete ="Select count(mail) as nb, nom, prenom"
				+ " from user where mail='"+mail
				+"' and mdp='"+mdp+"';";
		Model unModele = new Model("localhost", "Jismen", "root","");
		unModele.chargerPilote();
		unModele.connexion();
		try
		{
			Statement unStat = unModele.getMaConnexion().createStatement();
			ResultSet unRes = unStat.executeQuery(requete);
			unRes.next();
			int nb = unRes.getInt("nb");
			if (nb>0)
			{
				resultats [0] = nb+"";
				resultats [1] = unRes.getString("nom");
				resultats [2] = unRes.getString("prenom");
			}
			unStat.close();
			unRes.close();
		}
		catch (SQLException exp)
		{
			System.out.println("Erreur de la requete "+requete);
		}
		unModele.deconnexion();
		return resultats;
	}
	// différente méthodes sur mes utilisateurs

	
	public static LinkedList<Utilisateur> selectAll()
	{
		LinkedList<Utilisateur> lesUtilisateurs = new LinkedList<Utilisateur>();
		String requete="Select nom, prenom, mail, role from utilisateur;";
		try{
			Model unModel = new Model("localhost", "Jismen", "root", "");
			unModel.connexion();
			Statement unStat = unModel.getMaConnexion().createStatement();
			ResultSet unRes = unStat.executeQuery(requete);
			while(unRes.next())
			{
				String nom = unRes.getString("Nom");
				String prenom = unRes.getString("Prenom");
				String mail = unRes.getString("Email");
				String role = unRes.getString("Role");
				Utilisateur unUtilisateur = new Utilisateur(nom,prenom,mail,role);
				lesUtilisateurs.add(unUtilisateur);				
			}
			unRes.close();
			unStat.close();
			unModel.deconnexion();
		}
		catch(SQLException exp)
		{
			System.out.println("Erreur d'exécution de la requete "+requete);
		}
		return lesUtilisateurs;
	}
	
	public static void ajouterUtilisateur(Utilisateur unUtilisateur)
	{
		String requete="insert into produit (Nom, Prenom, Tel, mail, mdp, role)values('"+unUtilisateur.getNom()+"','"+unUtilisateur.getPrenom()+"','"+unUtilisateur.getTel()+"','"+unUtilisateur.getMail()+"','"+unUtilisateur.getMdp()+"','"+unUtilisateur.getRole()+"');";
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
	
	public void supprimer (Utilisateur unUtilisateur)
	{
		String requete="delete utilisateur (Nom, Prenom, Tel, mail, mdp, role)values('"+unUtilisateur.getNom()+"','"+unUtilisateur.getPrenom()+"','"+unUtilisateur.getTel()+"','"+unUtilisateur.getMail()+"','"+unUtilisateur.getMdp()+"','"+unUtilisateur.getRole()+"');";
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
}