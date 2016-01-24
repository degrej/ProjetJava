package Controller;

public class Produit 
{
	private int idProduit, Qte;
	private String Nom, Tag;
	private float Prix;
	
	public Produit()
	{
		this.idProduit =0;
		this.Nom ="";
		this.Tag ="";
		this.Prix =0;
		this.Qte =0;
	}
	
	public Produit(int idProduit, String Nom, String Tag, float Prix, int Qte) 
	{
		this.idProduit = idProduit;
		this.Nom = Nom;
		this.Tag = Tag;
		this.Prix = Prix;
		this.Qte = Qte;
	}

	public void afficher()
	{
		System.out.println("Id : " + this.idProduit);
		System.out.println("Nom : " + this.Nom);
		System.out.println("Tag : " +this.Tag);
		System.out.println("Prix : " +this.Prix);
		System.out.println("Quantité: " +this.Qte);
	}
	
	public String toString()
	{
		return "\n id :"+this.idProduit+"\n nom : "+this.Nom+"\n tag :"+this.Tag+"\n prix:"+this.Prix+"\n quantite :"+this.Qte;
	}
	
	public void saisir()
	{
		this.Nom = Console.saisirString("Nom :");
		this.Tag = Console.saisirString("Tag");
		this.Prix = Console.saisirFloat("Prix");
		this.Qte = Console.saisirInt("Quantite");
	}	

	public int getIdProduit() 
	{
		return idProduit;
	}

	public int getQte() {
		return Qte;
	}

	public void setQte(int qte) {
		Qte = qte;
	}

	public void setIdProduit(int idProduit) 
	{
		this.idProduit = idProduit;
	}

	public String getNom() 
	{
		return Nom;
	}

	public void setNom(String nom) 
	{
		Nom = nom;
	}

	public String getTag() 
	{
		return Tag;
	}

	public void setTag(String tag) 
	{
		Tag = tag;
	}

	public float getPrix() 
	{
		return Prix;
	}

	public void setPrix(float prix) 
	{
		Prix = prix;
	}	
}


