/**
 * 
 */

/**
 * @author 1501224
 *
 */
public class Produit implements Stockable {
	
	private Integer id;
	private String 	nom;
	private int 	qty;
	private int 	prix;

	
	/**
	 * @param id
	 * @param nom
	 * @param qty
	 * @param prix
	 */
	public Produit(Integer id, String nom, int qty, int prix) {
		
		this.id = id;
		this.nom = nom;
		this.qty = qty;
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
	 * @return the qty
	 */
	public int getQty() {
		return qty;
	}
	/**
	 * @param qty the qty to set
	 */
	public void setQty(int qty) {
		this.qty = qty;
	}
	/**
	 * @return the prix
	 */
	public int getPrix() {
		return prix;
	}
	/**
	 * @param prix the prix to set
	 */
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public Produit(Integer id, String nom) {
		
		this.id = id;
		this.nom = nom;
		this.qty = 0;
		this.prix = 0;
	}

	public Produit(Integer id, String nom, int prix) {
		
		this.id = id;
		this.nom = nom;
		this.qty = 0; // initialisation du stock
		this.prix = prix;
	}

	/* (non-Javadoc)
	 * @see Stockable#getId()
	 */
	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	/* (non-Javadoc)
	 * @see Stockable#addQty()
	 */
	@Override
	public void addQty() {

		this.qty++;
	}

	/* (non-Javadoc)
	 * @see Stockable#addQty(int)
	 */
	@Override
	public void addQty(int combien) {
		// TODO Auto-generated method stub
		
		this.qty += combien;

	}

	/* (non-Javadoc)
	 * @see Stockable#removeQty()
	 */
	@Override
	public void removeQty() {
		// TODO Auto-generated method stub
		this.qty --;

	}

	/* (non-Javadoc)
	 * @see Stockable#dispo()
	 */
	@Override
	public boolean dispo() {
		// TODO Auto-generated method stub
		return this.qty > 0;
	}

}
