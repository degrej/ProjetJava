package Views;

import Controller.Produit;

public class viewProduit 
{
	public static void afficheListeProduits (String chaine)
	{
		System.out.println(chaine);
	}
	
	public static Produit saisieProduit ()
	{
		Produit unProduit = new Produit();
		unProduit.saisir();
		return unProduit;
	}
}
