/**
 * 
 */
package model;

import java.util.Observable;
 

/**
 * | @Author : @Fred || 17 f�vr. 2020 || 11:35:41 | *
 *
 */

public class MonModel extends Observable {

	//ATTRIBUTS
	private int montantInsere = 0;
	private StockProduits monStock;
	
	//CONSTRUCTEUR
	public MonModel() {
		
	}

	//GETTERS & SETTERS
	public int getMontantInsere() {
		return montantInsere;
	}
	/**
	 * @param montantInsere the montantInsere to set
	 */
	public void setMontantInsere(int montantInsere) {
		this.montantInsere = montantInsere;
	}
	
	
	/**
	 * @return the monStock
	 */
	public StockProduits getMonStock() {
		return monStock;
	}

	/**
	 * @param monStock the monStock to set
	 */
	public void setMonStock(StockProduits monStock) {
		this.monStock = monStock;
	}

	private void notifierLesChangements() {
		// j'ai fait un traitement, des modifs -> je dois prevenir ceux qui me regardent
		setChanged();
		notifyObservers();
	}
	
	//METHODES METIER
	public void insere(int val) {
		this.montantInsere += val;
		notifierLesChangements();
	}

}
