package model;
/**
 * | @Author : @Fred || 10 f�vr. 2020 || 11:36:52 | *
 */
public enum Pieces 
{	
	P10("Piece(s) de 0.10�"	, (short)10	,"P10"),
	P20("Piece(s) de 0.20�"	, (short)20	,"P20"),
	P50("Piece(s) de 0.50�"	, (short)50	,"P50"),
	P100("Piece(s) de 1�"	, (short)100,"P100"),
	P200("Piece(s) de 2�"	, (short)200,"P200");
	
	/*****Propri�t�s*****/
	private final String 	nom;
	private final short 	valeur;
	private final String 	typePiece;
	
	/*****Constructeur*****/
	/**
	 * @param nom
	 * @param valeur
	 */
	private Pieces(String pNom, short pValeur, String tp) {
		this.nom 		= pNom;
		this.valeur 	= pValeur;
		this.typePiece 	= tp;
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
	
	/**
	 * @return the typePiece
	 */
	public String getTypePiece() {
		return typePiece;
	}

	/*****M�thodes*****/
	public static String[] listPiece()
	{
		String[] tableau = new String[Pieces.values().length];
		for(byte i = 0 ; i < tableau.length ; i++)
		{
			tableau[i] = Pieces.values()[i].getNom();
		}
		return tableau;
	}	
}
