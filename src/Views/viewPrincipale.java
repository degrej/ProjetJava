package 
Views;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class viewPrincipale extends JFrame implements ActionListener
{
	// les panels
			private JPanel panelMenu = new JPanel();
			private JPanel panelUtilisateur = new JPanel();
			private JPanel panelProduit = new JPanel();
			private JPanel panelCouleur = new JPanel();
			
			// construction des objets du panel
			private JButton btUtilisateur = new JButton("Utilisateur");
			private JButton btProduit = new JButton("Produit");
			private JButton btCouleur = new JButton("Couleur");
			private JButton btQuitter = new JButton("Quitter");
			
	public viewPrincipale()
	{		
		this.setTitle("Menu principal");
		this.setResizable(false);
		this.setBounds(400, 400, 400, 400);
		this.setLayout(null);
		
		// construction du panel Menu
		this.panelMenu.setBounds(10, 10, 200, 200);
		this.panelMenu.setBackground(Color.gray);
		this.panelMenu.setLayout(new GridLayout(4,1));
		this.panelMenu.add(new JLabel("Menu principal"));
		this.panelMenu.add(this.btCouleur);
		this.panelMenu.add(this.btProduit);
		this.panelMenu.add(this.btUtilisateur);
		this.panelMenu.add(this.btQuitter);
		this.panelMenu.add(new JLabel(""));
		this.panelMenu.setVisible(true);
		this.add(this.panelMenu);
		
		// rendre les boutons écoutables
		this.btUtilisateur.addActionListener(this);
		this.btCouleur.addActionListener(this);
		this.btUtilisateur.addActionListener(this);
		this.btQuitter.addActionListener(this);
		
		// construction du panel Utilisateur
		this.panelUtilisateur.setBounds(10,10,200,200);
		this.panelUtilisateur.setBackground(Color.green);
		this.panelUtilisateur.setLayout(null);
		this.panelUtilisateur.setVisible(false);
		this.add(this.panelUtilisateur);
		
		// construction du panel Couleur
		this.panelCouleur.setBounds(10,10,200,200);
		this.panelCouleur.setBackground(Color.lightGray);
		this.panelCouleur.setLayout(null);
		this.panelCouleur.setVisible(false);
		this.add(this.panelCouleur);
		
		// construction du panel Produit
		this.panelProduit.setBounds(10, 10, 200, 200);
		this.panelProduit.setBackground(Color.magenta);
		this.panelProduit.setVisible(false);
		this.add(this.panelProduit);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == this.btQuitter)
		{
			if(JOptionPane.showConfirmDialog(this, "Voulez vous quitter l'application?", "Quitter", JOptionPane.OK_CANCEL_OPTION)==0);
			{
				this.dispose();
			}
		}
		else if (e.getSource()== this.btCouleur)
		{
			this.panelCouleur.setVisible(true);
			this.panelUtilisateur.setVisible(false);
			this.panelProduit.setVisible(false);
		}
		else if (e.getSource()== this.btUtilisateur)
		{
			this.panelCouleur.setVisible(false);
			this.panelUtilisateur.setVisible(true);
			this.panelProduit.setVisible(false);
		}
		else if (e.getSource()== this.btProduit)
		{
			this.panelCouleur.setVisible(false);
			this.panelUtilisateur.setVisible(false);
			this.panelProduit.setVisible(true);
		}
		
	}

}
