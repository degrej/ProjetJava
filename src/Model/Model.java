package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
// permet de se connecter et se déconnecter de la BDD vérifie si le Driver est la.

public class Model 
{
	private String serveur, bdd, user, mdp;
	
	private Connection maConnexion;
	
	public Model (String serveur, String bdd, String user, String mdp)
	{
		this.serveur = serveur;
		this.bdd = bdd;
		this.user = user;
		this.mdp = mdp;
		this.maConnexion = null;
	}
	public void chargerPilote()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch (ClassNotFoundException exp)
		{
			System.out.println("Erreur de chargement du pilote Mysql !");
		}
	}
	
	public void connexion()
	{
		String url = this.serveur+"/"+this.bdd;
		this.chargerPilote();
		try{
			this.maConnexion = DriverManager.getConnection("jdbc:mysql://"+url, this.user, this.mdp);
		}
		catch(SQLException exp)
		{
			System.out.println("Impossible de se connecter au "+url);
		}
	}
	
	public void deconnexion()
	{
		try{
			if (this.maConnexion != null)
			{
				this.maConnexion.close();
			}
		}
		catch(SQLException exp)
		{
			System.out.println("Erreur de fermeture de la connexion!");
		}
	}
	
	public Connection getMaConnexion ()
	{
		return this.maConnexion;
	}
}