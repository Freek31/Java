import javax.swing.plaf.synth.SynthSeparatorUI;

/**
 * 
 */

/**
 * @author 1501224
 *
 */
public class LanceurBoisson {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StockBoisson monStock = new StockBoisson();
		monStock.addProduit(new Produit(1,"Coca",60), 5);
		monStock.addProduit(new Produit(2,"sunny",20), 2);
		monStock.addProduit(new Produit(1,"Coc",60), 5);
	
		System.out.println(monStock.getBoissonById(2).getProd().getNom());
		
		System.out.println(monStock.getBoissonById(1).getProd().getNom());
		
		
		
	
	}

}
