package Views;

import Controller.Createur;

public class viewCreateur 
{
	public static void afficherlisteCreateur (String chaine)
	{
		System.out.println(chaine);
	}
	
	public static Createur saisieCreateur()
	{
		Createur unCreateur = new Createur();
		unCreateur.saisir();
		return unCreateur;
	}

}
