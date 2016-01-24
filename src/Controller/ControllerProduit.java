package Controller;

import java.util.LinkedList;
import java.util.Scanner;

import Model.ModelProduit;
import Views.viewProduit;

public class ControllerProduit 
{
	private LinkedList<Produit> uneListe;
		
		public ControllerProduit()
		{
			this.uneListe= new LinkedList<Produit>();
		}
		
		public void listerProduits()
		{
			// appel du modele
			this.uneListe = ModelProduit.selectAll();		
		}
		
		public String toString()
		{
			String chaine ="";
			for (Produit unProduit : this.uneListe)
			{
				chaine += unProduit.toString();
			}
			return chaine;
		}
		
		public void suppressionProduit()
		// supression d'un Produit qui n'a pas de nom
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Veuillez saisir le nom du produit a supprimer :");
			String str = sc.nextLine();
			for (Produit unProduit : this.uneListe)
			{
				if (unProduit.getNom().contentEquals(str))
				{
					this.uneListe.remove(unProduit);
				}
			}
		}
		
		public void appelviewProduit()
		{
			// appel de la vue
			this.listerProduits();
			this.suppressionProduit();
			
			viewProduit.afficheListeProduits(this.toString());
		}
		
		public void inserer()
		{
			Produit unProduit =viewProduit.saisieProduit();
			ModelProduit.ajouterProduit(unProduit);			
		}

}
