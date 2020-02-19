
public class Piece implements Stockable {
	private static int cpt = 1; 
	
	private Integer id;
	private String  nom;
	private int     valeur;
	private int 	quantity;
	
	
	public Piece(String nom, int valeur) {
		super();
		this.id = cpt++;
		this.nom = nom;
		this.valeur = valeur;
		this.quantity = 0;
	}
	
	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	@Override
	public void addQty() {
		// TODO Auto-generated method stub
		this.quantity++;
	}

	@Override
	public void addQty(int combien) {
		// TODO Auto-generated method stub
		this.quantity+=combien;
	}

	@Override
	public void removeQty() {
		// TODO Auto-generated method stub
		this.quantity--;
	}

	@Override
	public boolean dispo() {
		// TODO Auto-generated method stub
		return this.quantity>0;
	}

	/**
	 * @return the valeur
	 */
	public int getValeur() {
		return valeur;
	}

	/**
	 * @param valeur the valeur to set
	 */
	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	/**
	 * @param id
	 * @param nom
	 * @param valeur
	 * @param quantity
	 */
	

}
