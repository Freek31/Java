/**
 * 
 */

/**
 * @author 1501224
 *
 */
public class ProduitStocke {
	
	private Produit prod;
	private Integer qteEnStock;
	
	/**
	 * @param prod
	 * @param qteEnStock
	 */
	public ProduitStocke(Produit prod, Integer qteEnStock) {
		super();
		this.prod = prod;
		this.qteEnStock = qteEnStock;
	}
	/**
	 * @return the prod
	 */
	public Produit getProd() {
		return prod;
	}
	/**
	 * @param prod the prod to set
	 */
	public void setProd(Produit prod) {
		this.prod = prod;
	}
	/**
	 * @return the qteEnStock
	 */
	public Integer getQteEnStock() {
		return qteEnStock;
	}
	/**
	 * @param qteEnStock the qteEnStock to set
	 */
	public void setQteEnStock(Integer qteEnStock) {
		this.qteEnStock = qteEnStock;
	}
	
	

}
