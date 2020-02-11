/**
 * 
 */

/**
 * @author 31010-83-11
 *
 */
public abstract class Forme implements Dessinable {
	
	private float aire;
	
	public Forme() {
		 
	 }
	 
	 public void quiEsTu() {
		 System.out.println("je suis une forme geo");
	 }
	 
	 public abstract float getPerimetre();
	
	 /**
		 * @return the aire
		 */
		public float getAire() {
			return aire;
		}

}
