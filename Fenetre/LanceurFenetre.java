import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
 
/**
 * 
 */

/**
 * @author Alix
 *
 * 16:08:37
 */
public class LanceurFenetre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
			FenetreAvecBouton coucou= new FenetreAvecBouton();
			coucou.buildContentPane();
			coucou.setVisible(true);
			//coucou.pack();

	}

}
