package Views;

import Controller.Couleur;

public class viewCouleur 
{
	public static void afficherlisterCouleurs (String chaine)
	{
		System.out.println(chaine);
	}
	
	public static Couleur saisieCouleur()
	{
		Couleur uneCouleur = new Couleur();
		uneCouleur.saisir();
		return uneCouleur;
	}
}
