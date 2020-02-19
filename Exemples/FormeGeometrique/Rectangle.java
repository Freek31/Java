/**
 * 
 */

/**
 * @author 31010-83-11
 *
 */
public class Rectangle extends Forme{
	
	//ATTRIBUTS
	private int longueur;
	private int largeur;
	/**
	 * @param longueur
	 * @param largeur
	 */
	public Rectangle(int longueur, int largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}
	/**
	 * @return the longueur
	 */
	public int getLongueur() {
		return longueur;
	}
	/**
	 * @param longueur the longueur to set
	 */
	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}
	/**
	 * @return the largeur
	 */
	public int getLargeur() {
		return largeur;
	}
	/**
	 * @param largeur the largeur to set
	 */
	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	
	@Override
	public void dessiner() {
		// TODO Auto-generated method stub
		System.out.println("je suis un tangle de coté long  "+ this.longueur+" et de coté moins long de "+largeur);
		
	}
	@Override
	public float getPerimetre() {
		// TODO Auto-generated method stub
		return (this.longueur+this.largeur)*2;
	}
}
