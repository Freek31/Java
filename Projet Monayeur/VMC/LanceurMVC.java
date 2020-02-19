import controller.MonControleur;
import model.MonModel;
import views.View1;
import views.View2;

/**
 * 
 */

/**
 * @author 1501224
 *
 */
public class LanceurMVC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		View2 f2 = new View2();
		f2.setVisible(true);
		
		// d�claration de la vue
		View1 maFenetreMVC = new View1();
		maFenetreMVC.afficher();
		
		// declaration d'un modele
		MonModel modeleDeLApplication = new MonModel();
		
		// declaration du controleur
		MonControleur ctrl = new MonControleur(modeleDeLApplication); 
		
		// Pr�senter le controleur � la vue
		maFenetreMVC.setListener(ctrl);
		
		// j'ajoute ma fenetre � la liste des observer de mon modele
		modeleDeLApplication.addObserver(maFenetreMVC);
		
		
		
		
		
	}

}
