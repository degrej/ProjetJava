package Controller;

import java.util.LinkedList;
import java.util.Scanner;

import Model.ModelCouleur;
import Views.viewCouleur;

public class ControllerCouleur 
{
	private LinkedList<Couleur> couleurListe;
	
	public ControllerCouleur()
	{
		this.couleurListe= new LinkedList<Couleur>();
	}
	
	public void listerCouleurs()
	{
		// appel du modele
		this.couleurListe = ModelCouleur.selectAll();		
	}
	
	public String toString()
	{
		String chaine ="";
		for (Couleur uneCouleur : this.couleurListe)
		{
			chaine += uneCouleur.toString();
		}
		return chaine;
	}
	
	public void suppressionCouleur()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir le nom de la couleur a supprimer :");
		String str = sc.nextLine();
		for (Couleur uneColeur : this.couleurListe)
		{
			if (uneColeur.getNomCouleur().contentEquals(str))
			{
				this.couleurListe.remove(uneColeur);
			}
		}
	}
	
	public void appelviewCouleur()
	{
		// appel de la vue
		this.listerCouleurs();		
		viewCouleur.afficherlisterCouleurs(this.toString());
	}
	
	public void inserer()
	{
		Couleur uneCouleur =viewCouleur.saisieCouleur();
		ModelCouleur.ajouterCouleur(uneCouleur);			
	}
}
