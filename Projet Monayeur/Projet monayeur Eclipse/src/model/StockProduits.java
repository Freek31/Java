package model;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * | @Author : @Fred || 12 f�vr. 2020 || 10:27:57 | *
 *
 */
public class StockProduits {

	private Map<Integer, Produit> listeBoissons; // on declare une liste de boissons de type map

	/**
	 * @param listeBoissons
	 */
	// constructor
	public StockProduits() {
		// super();
		listeBoissons = new HashMap<Integer, Produit>(); // on nstancie une collection hashmap
	}

	/**
	 * METHODES
	 */
	/**
	 * 
	 * @param boisson
	 */

	// boisson dispo ?
	public boolean containsProduit(int id) {

		if (listeBoissons.containsKey(id)) {
			if (listeBoissons.get(id).getStock() > 0) {
				return true;
			}
		}
		return false;
	}

	public Produit getBoissonById(int i) {
		return listeBoissons.get(i);
	}

	// permet d'ajouter un nouveau produit dans la liste du stock de boissons
	public void addNewProduit(Produit boisson) {
		this.listeBoissons.put(boisson.getId(), boisson);

		/*
		 * if (listeBoissons.containsKey(boisson)) { int temp =
		 * listeBoissons.get(boisson); listeBoissons.replace(boisson, temp + quantity);
		 * } else { listeBoissons.put(boisson, quantity); }
		 */
	}

	/**
	 * permet d'ajouter des boissons dans le stock
	 * 
	 * @param boisson  une boisson
	 * @param quantity une quantit�
	 */

	// delivrer boisson
	/*
	 * public boolean deliverProduit(Produit boisson) { if
	 * (containsProduit(boisson.getId())) { removeProduit(boisson); return true; }
	 * return false; }
	 */

	/*
	 * public Set<Produit> getSetProduit() {
	 * 
	 * return listeBoissons.keySet(); }
	 */
	public String[] getArrayProduit() {
		String[] output = new String[listeBoissons.keySet().size()];
		int i = 0;
		for (Entry<Integer, Produit> p : listeBoissons.entrySet()) {
			output[i++] = p.getValue().getNom();
		}
		return output;

	}

	// maj stock

}
