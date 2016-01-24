package Controller;

import java.util.LinkedList;
import java.util.Scanner;

import Model.ModelCouleur;
import Model.ModelCreateur;
import Views.viewCouleur;
import Views.viewCreateur;

public class ControllerCreateur 
{
	private LinkedList<Createur> createurListe;
	
	public ControllerCreateur()
	{
		this.createurListe = new LinkedList<Createur>();
	}
	
	public void listerCreateur()
	{
		this.createurListe = ModelCreateur.selectAll();
	}
	
	public String toString()
	{
		String chaine ="";
		for (Createur unCreateur : this.createurListe)
		{
			chaine += unCreateur.toString();
		}
		return chaine;
	}
	
	public void suppressionCreateur()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir le nom du createur a supprimer :");
		String str = sc.nextLine();
		for (Createur unCreateur : this.createurListe)
		{
			if (unCreateur.getNomCreateur().contentEquals(str))
			{
				this.createurListe.remove(unCreateur);
			}
		}
	}
	
	public void appelviewCreateur()
	{
		// appel de la vue
		this.listerCreateur();		
		viewCreateur.afficherlisteCreateur(this.toString());
	}
	
	public void inserer()
	{
		Createur unCreateur =viewCreateur.saisieCreateur();
		ModelCreateur.ajouterCreateur(unCreateur);			
	}
}
