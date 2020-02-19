

import controller.MonControleur;
import model.Menu;
import model.MonModel;
import model.Produit;
import model.StockProduits;
import views.View;


/**
 * | @Author : @Fred || 12 f�vr. 2020 || 14:44:23 | *
 *
 */
public class LanceurProduit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creation du stock
		StockProduits monStock = new StockProduits();
		monStock.addNewProduit(new Produit(1, "Coca", 60, 6));
		monStock.addNewProduit(new Produit(2, "Canada dry", 100, 2));
		monStock.addNewProduit(new Produit(3, "Sprite", 50, 4));
		monStock.addNewProduit(new Produit(4, "7Up", 60, 3));
		monStock.addNewProduit(new Produit(5, "Orangina", 50, 4));
		monStock.addNewProduit(new Produit(6, "Schweppes", 70, 1));
		monStock.addNewProduit(new Produit(7, "Perrier", 75, 2));


		// System.out.println(monStock.getBoissonById(2).getProd().getNom());
		// System.out.println(monStock.getBoissonById(1).getStock());

		//Menu monMenu = new Menu("Liste boisson :", monStock.getArrayProduit());
		//monMenu.afficherMenu();
		View f = new View(monStock.getArrayProduit());
		
		// declaration d'un modele
		MonModel modeleDeLApplication = new MonModel();
		modeleDeLApplication.setMonStock(monStock);
		
		// declaration du controleur
		MonControleur ctrl = new MonControleur(modeleDeLApplication);

		// Pr�senter le controleur � la vue
		f.setListener(ctrl);

		// j'ajoute ma fenetre � la liste des observer de mon modele
		modeleDeLApplication.addObserver(f);
		
		f.afficher();

	}

}
