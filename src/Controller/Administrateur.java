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
		this.role = Console.saisirString("Entrer le rôle de l'administrateur: ");
	}
	
	public void afficher()
	{
		super.afficher();
		this.role = Console.saisirString("Le rôle de l'administrateur: " +this.role);
	}
}
