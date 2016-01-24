package Controller;

public class Controller 
{

	public static void main(String[] args) 
	{
		// Produit
		ControllerProduit unControleurProduit = new ControllerProduit();
		unControleurProduit.inserer();
		unControleurProduit.appelviewProduit();
		unControleurProduit.suppressionProduit();
		// Couleur
		ControllerCouleur unControleurCouleur = new ControllerCouleur();
		unControleurCouleur.inserer();
		unControleurCouleur.appelviewCouleur();
		unControleurCouleur.suppressionCouleur();
		// Createur
		ControllerCreateur unControleurCreateur = new ControllerCreateur();
		unControleurCreateur.inserer();
		unControleurCreateur.appelviewCreateur();
		unControleurCreateur.suppressionCreateur();
		// Utilisateur
		ControllerUtilisateur unControleurUtilisateur = new ControllerUtilisateur();
		unControleurUtilisateur.inserer();
		unControleurUtilisateur.appelviewUtilisateur();
		// Client
		/*ControllerClient unControleurClient = new ControllerClient();
		unControleurClient.inserer();
		unControleurClient.appelviewClient();		
		// Administrateur
		ControllerAdministrateur unControleurAdministrateur = new ControllerAdministrateur();
		unControleurAdministrateur.inserer();
		unControleurAdministrateur.appelviewAdministrateur;*/
	}

}
