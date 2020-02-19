/**
 * 
 */

/**
 * @author Kevin Lafon
 * @creation_date 7 févr. 2020
 * @last_change_date 07/02/2020 11:13:21
 */
public enum Piece 
{	
	P10("Piece(s) de 0.10€", (short)10),
	P20("Piece(s) de 0.20€", (short)20),
	P50("Piece(s) de 0.50€", (short)50),
	P100("Piece(s) de 1€", (short)100),
	P200("Piece(s) de 2€", (short)200);
	
	/*****Propriétés*****/
	private final String nom;
	private final short valeur;
	
	/*****Constructeur*****/
	/**
	 * @param nom
	 * @param valeur
	 */
	private Piece(String pNom, short pValeur) {
		this.nom = pNom;
		this.valeur = pValeur;
	}
	
	/*****Accesseurs*****/
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @return the valeur
	 */
	public short getValeur() {
		return valeur;
	}
	
	/*****Méthodes*****/
	public static String[] listPiece()
	{
		String[] tableau = new String[Piece.values().length];
		for(byte i = 0 ; i < tableau.length ; i++)
		{
			tableau[i] = Piece.values()[i].getNom();
		}
		return tableau;
	}
	
}
