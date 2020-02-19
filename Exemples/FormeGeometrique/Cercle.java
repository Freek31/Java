/**
 * 
 */

/**
 * @author 31010-83-11
 *
 */
public class Cercle extends Forme{
	
	static final double PI = 3.14159;
	
	
	private int rayon;

	/**
	 * @param rayon
	 */
	public Cercle(int rayon) {
		this.rayon = rayon;
	}

	/**
	 * @return the rayon
	 */
	public int getRayon() {
		return rayon;
	}

	/**
	 * @param rayon the rayon to set
	 */
	public void setRayon(int pRayon) {
		if (pRayon > 0) {
			this.rayon = pRayon;
		}
		// TODO : j'ai un souci si c'est pas correct que faire ?
	}
	
	public float getCirconference() {
		
		return (float) (2*PI*this.rayon);
	}
	
	public void dessiner() {
		System.out.println("je suis un cercle de rayon "+ this.rayon);
		// TODO : implementer la methode 3D qui déchire et va vrai bien
	}

	@Override
	public float getPerimetre() {
		// TODO Auto-generated method stub
		return getCirconference();
	}
	
	
	
	

}
