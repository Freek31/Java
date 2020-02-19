package model;

/**
 * | @Author : @Fred || 11 f�vr. 2020 || 14:43:24 | *
 *
 */
public class Produit {
	private String nom;
	private float prix;
	private int id;
	private int stock;

	public Produit() {
	}

	/**
	 * @param nom @param prix @param id @param stock
	 */
	public Produit(int id, String nom, float prix, int stock) {
		super();
		this.id = id;
		this.nom = nom;
		this.prix = prix;
		this.stock = stock;
	}
	
	// on mets a jour le stock
	public void addStock(int qtearajouter) {
		this.stock += qtearajouter;
	}
	// On enleve du stock
	public void removeStock(int qtearajouter) {
		this.stock -= qtearajouter;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the stock
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * @param stock the stock to set
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prix
	 */
	public float getPrix() {
		return prix;
	}

	/**
	 * @param prix the prix to set
	 */
	public void setPrix(float prix) {
		this.prix = prix;
	}

}
