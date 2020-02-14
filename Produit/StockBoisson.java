import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * 
 */

/**
 * @author 1501224
 *
 */
public class StockBoisson {

	private Map<Integer, ProduitStocke> listeBoissons;

	/**
	 * @param listeBoissons
	 */

	public StockBoisson() {
		// super();
		listeBoissons = new TreeMap<>();
	}

	/**
	 * METHODES
	 */
	/**
	 * permet d'ajouter des boissons dans le stock
	 * 
	 * @param boisson
	 *            une boisson
	 * @param quantity
	 *            une quantité
	 */
	public void addProduit(Produit boisson, int quantity) {
		
		this.listeBoissons.put(boisson.getId(), new ProduitStocke(boisson, quantity));
		/*
		if (listeBoissons.containsKey(boisson)) {
			int temp = listeBoissons.get(boisson);
			listeBoissons.replace(boisson, temp + quantity);
		} else {
			listeBoissons.put(boisson, quantity);
		}*/	}
	/**
	 * 
	 * @param boisson
	 */
	public void removeProduit(Produit boisson) {
		/*
		if (containsProduit(boisson)) {
			listeBoissons.replace(boisson, listeBoissons.get(boisson) - 1);
		}
		*/
	}
/*
	// boisson dispo ?
	public boolean containsProduit(Produit boisson) {
		
		if (listeBoissons.containsKey(boisson)) {
			if (listeBoissons.get(boisson) > 0) {
				return true;
			}
		}
		return false;
		
	}
*/

	public ProduitStocke getBoissonById(int i) {
		return listeBoissons.get(i);
		
		
	}
	
	/*
	// delivrer boisson
	public boolean deliverProduit(Produit boisson) {
		if (containsProduit(boisson)) {
			removeProduit(boisson);
			return true;
		}
		return false;
	}
	*/
	/*
	public Set<Produit> getSetProduit(){
		
		return listeBoissons.keySet();
	}
	public String[] getArrayProduit() {
		String[] output = new String[listeBoissons.keySet().size()];
		int i = 0;
		for(Produit p: listeBoissons.keySet()) {
			output[i++] = p.getNom();
		}
		return output;
		
	}
*/
	// maj stock

}
