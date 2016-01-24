package Controller;

public class Utilisateur 
{
	//protected int idUtilisateur;
	protected String Tel;
	protected String Nom, Prenom, mail, mdp, Role;
	
	public Utilisateur()
	{
		//this.idUtilisateur = 0;
		this.Nom= "";
		this.Prenom = "";
		this.mail= "";
		this.mdp = "";
		this.Tel = "";
		this.Role = "";
	}
	public Utilisateur( String Nom, String Prenom, String mail, String Role)
	{
		//this.idUtilisateur = idUtilisateur;
		this.Nom= Nom;
		this.Prenom = Prenom;
		this.mail= mail;
		this.mdp = "";
		this.Tel ="";
		this.Role = Role;
	}
	
	public void afficher()
	{
		//System.out.println("idUtilisateur :" +this.idUtilisateur);
		System.out.println("Nom :" +this.Nom);
		System.out.println("Prenom :" +this.Prenom);
		System.out.println("Mail :" +this.mail);
		//System.out.println("Mot de passe :" +this.mdp);
		System.out.println("Telephone :" +this.Tel);
		System.out.println("Role :" +this.Role);
	}
	
	
	
	
	public String getTel() {
		return Tel;
	}
	public void setTel(String tel) {
		Tel = tel;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
}
