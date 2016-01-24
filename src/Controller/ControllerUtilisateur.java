package Controller;

import java.util.LinkedList;
import java.util.Scanner;

import Model.ModelUtilisateur;
import Views.viewProduit;
import Views.viewUtilisateur;

public class ControllerUtilisateur 
{
	private LinkedList<Utilisateur> listeUtilisateur;
	
	public ControllerUtilisateur()
	{
		this.listeUtilisateur = new LinkedList<Utilisateur>();
	}
	
	public void listerUtilisateur()
	{
		// appel du model
		this.listeUtilisateur = ModelUtilisateur.selectAll();
	}
	
	public void suppressionUtilisateur()
	// supression d'un Utilisateur par la saisie du nom
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir le nom de l'utilisateur a supprimer :");
		String str = sc.nextLine();
		for (Utilisateur unUtilisateur : this.listeUtilisateur)
		{
			if (unUtilisateur.getNom().contentEquals(str))
			{
				this.listeUtilisateur.remove(unUtilisateur);
			}
		}
	}
	
	public void appelviewUtilisateur()
	{
		// appel de la vue
		this.listerUtilisateur();
		this.suppressionUtilisateur();
		
		viewProduit.afficheListeProduits(this.toString());
	}
	
	public void inserer()
	{
		Utilisateur unUtilisateur =viewUtilisateur.saisieUtilisateur();
		ModelUtilisateur.ajouterUtilisateur(unUtilisateur);			
	}
}
