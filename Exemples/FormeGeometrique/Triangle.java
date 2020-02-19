/**
 * 
 */

/**
 * @author 31010-83-11
 *
 */
public class Triangle extends Forme implements Coloriable {
	
	public int cote1;
	public int cote2;
	public int cote3;
	/**
	 * @param cote1
	 * @param cote2
	 * @param cote3
	 */
	public Triangle(int cote1, int cote2, int cote3) {
		super();
		this.cote1 = cote1;
		this.cote2 = cote2;
		this.cote3 = cote3;
	}
	/**
	 * @return the cote1
	 */
	public int getCote1() {
		return cote1;
	}
	/**
	 * @param cote1 the cote1 to set
	 */
	public void setCote1(int cote1) {
		this.cote1 = cote1;
	}
	/**
	 * @return the cote2
	 */
	public int getCote2() {
		return cote2;
	}
	/**
	 * @param cote2 the cote2 to set
	 */
	public void setCote2(int cote2) {
		this.cote2 = cote2;
	}
	/**
	 * @return the cote3
	 */
	public int getCote3() {
		return cote3;
	}
	/**
	 * @param cote3 the cote3 to set
	 */
	public void setCote3(int cote3) {
		this.cote3 = cote3;
	}
	
	@Override
	public void dessiner() {
		// TODO Auto-generated method stub
		System.out.println("je suis un triangle");
	}
	@Override
	public void peinder(int color) {
		// TODO Auto-generated method stub
		System.out.println("je suis un triangle de numero de couleur "+ color);
	}
	@Override
	public float getPerimetre() {
		// TODO Auto-generated method stub
		return this.cote1+this.cote2+this.cote3;
	}
	
	
}
