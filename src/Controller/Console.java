package Controller;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console 
{
	// définition du buffer de lecture
	private static BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));
	
	public static int saisirInt(String message)
	{
		int nb = 0;
		String chaine ="";
		boolean ok =false;
		System.out.println(message);
		do{
		try{
			chaine = entree.readLine();
			nb = Integer.parseInt(chaine);	
			ok=true;
		}
		catch(IOException exp)
		{
			System.out.println("Erreur de lecture sur le clavier");
		}
		catch(NumberFormatException exp)
		{
			System.out.println("Erreur du format du nombre!");
		}
	}while (ok==false);
		
		return nb;
	}
	
	public static float saisirFloat(String message)
	{
		float nb = 0;
		String chaine ="";
		boolean ok =false;
		System.out.println(message);
		do{
		try{
			chaine = entree.readLine();
			nb = Float.parseFloat(chaine);	
			ok=true;
		}
		catch(IOException exp)
		{
			System.out.println("Erreur de lecture sur le clavier");
		}
		catch(NumberFormatException exp)
		{
			System.out.println("Erreur du format du nombre!");
		}
	}while (ok==false);
		
		return nb;
	}
	
	public static String saisirString(String message)
	{
		String chaine= "";
		System.out.println(message);
		try{
			chaine = entree.readLine();
		}
		catch (IOException exp)
		{
			System.out.println("Erreur de lecture sur le clavier");
		}
		return chaine;
	}
	
	public static char saisirChar(char tel)
	{
		String chaine= "";
		System.out.println(tel);
		try{
			chaine = entree.readLine();
		}
		catch (IOException exp)
		{
			System.out.println("Erreur de lecture sur le clavier");
		}
		return chaine.charAt(0);
	}
}

