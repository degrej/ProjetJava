package Controller;

public class Administrateur extends Utilisateur
{
	private String role;
	
	public Administrateur()
	{
		super();
		this.role = "";
	}
	
	public void saisir()
	{
		super.saisir();
		this.role = Console.saisirString("Entrer le r�le de l'administrateur: ");
	}
	
	public void afficher()
	{
		super.afficher();
		this.role = Console.saisirString("Le r�le de l'administrateur: " +this.role);
	}
}
