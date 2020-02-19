/**
 * 
 */

/**
 * @author 1501224
 *
 */
public class Produit implements Comparable<Produit>{
	
	private int id;
	private String nom;
	private float prix;
	
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
	 * @param id
	 * @param nom
	 * @param prix
	 */
	public Produit(int id, String nom, float prix) {
		super();
		this.id = id;
		this.nom = nom;
		this.prix = prix;
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
	@Override
	//methode qui permet de comparer deux produit en fonction de leurs prix.
	public int compareTo(Produit o) {
		if(prix > o.prix) {
			return 1;
		}else if ( prix < o.prix) {
			return -1;
		}
		return 0;
	}
	
	

}
