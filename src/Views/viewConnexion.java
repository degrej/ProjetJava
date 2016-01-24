package Views;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Model.ModelUtilisateur;


public class viewConnexion extends JFrame implements ActionListener
{
	private JTextField tfMail = new JTextField();
	private JPasswordField tfMdp = new JPasswordField();
	private JPanel unPanel = new JPanel(); 
	private JButton btAnnuler = new JButton("Annuler");
	private JButton btValider = new JButton("Valider");
	public viewConnexion()
	{
		this.setBounds(400, 400, 400, 400);
		this.setResizable(false);
		this.setTitle("Connexion Jismen");
		this.unPanel.setBounds(10, 10, 400, 400);
		this.unPanel.setBackground(Color.cyan);
		this.unPanel.setLayout(new GridLayout(5,2));
		this.unPanel.add(new JLabel());
		this.unPanel.add(new JLabel());
		this.unPanel.add(new JLabel("Email :"));
		this.unPanel.add(new JLabel("this.tfmail"));
		this.unPanel.add(new JLabel("Mot de passe :"));
		this.unPanel.add(new JLabel("this.tfmdp"));
		this.unPanel.add(new JLabel("this.btAnnuler"));
		this.unPanel.add(new JLabel("this.btValider"));
		this.unPanel.add(new JLabel());
		this.unPanel.add(new JLabel());
		this.setLayout(null);
		this.unPanel.setVisible(true);
		this.add(this.unPanel);
		this.btAnnuler.addActionListener(this);
		this.btValider.addActionListener(this);		
		
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource() == this.btAnnuler)
		{
			this.tfMail.setText("");
			this.tfMdp.setText("");
		}
		else if (e.getSource() == this.btValider)
		{
			// test de la connexion
			String email = this.tfMail.getText();
			String mdp = new String (this.tfMdp.getPassword());
			String resultats[] = ModelUtilisateur.verifConnexion(email, mdp);
			if (resultats[0]==null)
			{
				JOptionPane.showMessageDialog(this, "Vérifier vos identifiants.");
			}
			else
			{
				JOptionPane.showMessageDialog(this, "Bonjour "+resultats[1]+" "+resultats[2]+"");
				new viewPrincipale();
				this.dispose();
			}
		}
		
	}
}
