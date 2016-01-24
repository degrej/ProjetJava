package Controller;

public class Client extends Utilisateur
{
	private String Adresse, CP, Ville;
	
	public Client()
	{
		super();
		this.Adresse = "";
		this.CP = "";
		this.Ville = "";
	}
	
	public void saisir()
	{
		super.saisir();
		this.Adresse = Console.saisirString("Entrer l'adresse");
		this.CP = Console.saisirString("Entrer le code postal");
		this.Ville = Console.saisirString("Entrer la ville");
	}
	
	public void afficher()
	{
		super.afficher();
		this.Adresse =Console.saisirString("Votre adresse est :" +this.Adresse);
		this.CP = Console.saisirString("Votre code postal est :" +this.CP);
		this.Ville = Console.saisirString("Votre ville est :" +this.Ville);
	}

}
