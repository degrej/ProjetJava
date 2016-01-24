package Views;

import Controller.Utilisateur;

public class viewUtilisateur 
{
	public static void afficheListeUtilisateurs (String chaine)
	{
		System.out.println(chaine);
	}
	
	public static Utilisateur saisieUtilisateur ()
	{
		Utilisateur unUtilisateur = new Utilisateur();
		unUtilisateur.saisir();
		return unUtilisateur;
	}
}
