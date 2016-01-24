package Controller;

public class Couleur 
{
	private String NomCouleur;
	
	public Couleur()
	{
		this.NomCouleur = "";
	}
	
	public Couleur(String NomCouleur)
	{
		this.NomCouleur = NomCouleur;
	}
	
	public void saisir()
	{
		System.out.println("Couleur :"+this.NomCouleur);
	}
	
	public void afficher()
	{
		this.NomCouleur = Console.saisirString("La couleur est: "+this.NomCouleur);
	}
	
	public String toString()
	{
		return "Couleur :"+this.NomCouleur;
	}

	public String getNomCouleur() 
	{
		return NomCouleur;
	}

	public void setNomCouleur(String nomCouleur) 
	{
		NomCouleur = nomCouleur;
	}
}
