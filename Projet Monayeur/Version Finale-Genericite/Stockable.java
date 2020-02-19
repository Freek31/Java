/**
 * 
 */

/**
 * @author 1501224
 *
 */
public interface Stockable {
	
	public Integer 	getId();
	public void 	addQty();
	public void 	addQty(int combien);
	public void		removeQty();
	public boolean 	dispo();

}
