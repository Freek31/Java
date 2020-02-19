/**
 * 
 */
package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import model.MonModel;
import model.Pieces;

/**
 * | @Author : @Fred || 17 f�vr. 2020 || 09:23:24 | *
 *
 */
public class View extends JFrame implements Observer {

	// CONSTANTES

	// ATTRIBUTS
	private static final long serialVersionUID = 1L;

	private JButton[] buttons, buttons2;

	// Controleur associ�
	// private ActionListener al;

	// BANDEAU
	private JPanel bandeauHaut = new JPanel();
	private JTextField msgBandeauHaut = new JTextField("Distributeur Automatique de boissons");;

	// SELECTEUR DE BOISSONS
	private JPanel panelSelBoissons = new JPanel();

	// MONNAYEUR
	private JPanel panelMonnayeur = new JPanel();
	private JTextField txtVeuillezInsrerArgent;

	// BANDEAU MESSAGE BAS
	private JPanel panelBandeauBasMsg = new JPanel();
	private JTextField messageBandeauBas = new JTextField("ici je vous dirai quand �a m ira pas");

	public View(String[] tabNomsBoisson) {
		super();

		Container contenu = getContentPane();
		setSize(400, 400);
		// BANDEAU
		contenu.add(this.bandeauHaut, BorderLayout.NORTH);
		this.bandeauHaut.add(msgBandeauHaut);

		// SELECTEUR DE BOISSONS
		contenu.add(this.panelSelBoissons, BorderLayout.CENTER);
		panelSelBoissons.setLayout(new GridLayout(0, 2));

		// on veut afficher un bouton par produit coreespondant
		buttons = new JButton[tabNomsBoisson.length];

		for (int i = 0; i < buttons.length; i++) {
			this.buttons[i] = new JButton(tabNomsBoisson[i]);
			this.buttons[i].setActionCommand(tabNomsBoisson[i]);
			panelSelBoissons.add(buttons[i]);
		}

		

		// MONAYEUR
		this.panelBandeauBasMsg.add(messageBandeauBas);
		contenu.add(this.panelMonnayeur, BorderLayout.EAST);

		// PANNEAU PIECES INSEREES
		this.panelMonnayeur.setLayout(new BorderLayout());// on cree un nouveau layout pour la partie pieces

		txtVeuillezInsrerArgent = new JTextField();
		txtVeuillezInsrerArgent.setText("Veuillez ins\u00E9rer ARGENT");
		txtVeuillezInsrerArgent.setBackground(Color.BLACK);
		txtVeuillezInsrerArgent.setForeground(Color.GREEN);
		txtVeuillezInsrerArgent.setHorizontalAlignment(JTextField.RIGHT);
		this.panelMonnayeur.add(txtVeuillezInsrerArgent, BorderLayout.NORTH);

		// PANNEAU BOUTONS TYPE DE PIECES
		JPanel panel2 = new JPanel();
		buttons2 = new JButton[Pieces.values().length];
		this.panelMonnayeur.add(panel2, BorderLayout.CENTER);
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
		int i=0;
		for (Pieces p : Pieces.values()) {
			this.buttons2[i]= new JButton(p.getNom());
			this.buttons2[i].setActionCommand(p.getTypePiece());
			panel2.add(buttons2[i]);
			i++;
		}

		// BANDEAU BAS
		contenu.add(this.panelBandeauBasMsg, BorderLayout.SOUTH);
		this.panelBandeauBasMsg.add(messageBandeauBas);

	}

	public void afficher() {
		setVisible(true);
	}

	@Override
	public void update(Observable o, Object arg) {
		// Afficher le montant total ins�r�
		this.txtVeuillezInsrerArgent.setText(((MonModel) o).getMontantInsere() / 100f + " �");
	}

	public void setListener(ActionListener al) {
		for (int i = 0; i < buttons.length; i++) {
			buttons[i].addActionListener(al);
			
		}
		for (int i = 0; i < buttons2.length; i++) {
			buttons2[i].addActionListener(al);
			
		}
	}
}
