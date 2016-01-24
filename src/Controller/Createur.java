package Controller;

public class Createur 
{
	private String NomCreateur, Adresse, CP, Ville;
	
	public Createur ()
	{
		this.NomCreateur = "";
		this.Adresse = "";
		this.CP = "";
		this.Ville = "";
	}
	
	public Createur (String NomCreateur, String Adresse, String CP, String Ville)
	{
		this.NomCreateur = NomCreateur;
		this.Adresse = Adresse;
		this.CP = CP;
		this.Ville = Ville;
	}
	
	public void afficher()
	{
		System.out.println("Nom Createur: "+this.NomCreateur);
		System.out.println("Adresse :"+this.Adresse);
		System.out.println("Code Postal :"+this.CP);
		System.out.println("Ville :" +this.Ville);
	}
	
	public void saisir()
	{
		this.NomCreateur = Console.saisirString(NomCreateur);
		this.Adresse = Console.saisirString(Adresse);
		this.CP = Console.saisirString(CP);
		this.Ville = Console.saisirString(Ville);
	}

	public String getNomCreateur() {
		return NomCreateur;
	}

	public void setNomCreateur(String nomCreateur) {
		NomCreateur = nomCreateur;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public String getCP() {
		return CP;
	}

	public void setCP(String cP) {
		CP = cP;
	}

	public String getVille() {
		return Ville;
	}

	public void setVille(String ville) {
		Ville = ville;
	}
	
}
