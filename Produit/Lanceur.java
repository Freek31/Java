import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author 31010-83-11
 *
 */
public class Lanceur {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Rectangle monCarre = new Carre(66);
		monCarre.dessiner();
		
		
		
		// TODO Auto-generated method stub
		/*
		 * 
		 * 
		 * 
		Cercle monCercle = new Cercle(9);
		//monCercle.dessiner();
		
		Rectangle monRectongle = new Rectangle(5,9);
		//monRectongle.dessiner();
		
		Triangle monTriangle = new Triangle(1,2,3);
		//monTriangle.dessiner();
		//monTriangle.peinder(555);
		
		
		
		Dessinable monCercle2 = new Cercle(12);
		//monCercle2.dessiner();
		 */
		
		Dessinable[] feuilleDePapier = new Dessinable[4];
		/*
		 * feuilleDePapier[0] = monCercle;
		 
		feuilleDePapier[1] = monTriangle;
		feuilleDePapier[2] = monRectongle;
		*/
		
		feuilleDePapier[0] = new Cercle(9);
		feuilleDePapier[1] = new Rectangle(5,9);
		feuilleDePapier[2] = new Triangle(1,2,3);
		feuilleDePapier[3] = new Carre(88);
		//feuilleDePapier[4] = new DoraLExploratrice();
		
		
		
		//feuilleDePapier[2].quiEsTu();
		
		Dessinable unTruc = new Carre(128);
		//Cercle[] tabC = new Cercle[3];
		
		
		for (Dessinable d : feuilleDePapier) {
			d.dessiner();
			( (Forme) d ).quiEsTu();
		}
		
		List<Produit> listeBoissons = new ArrayList<Produit>();
		
		Produit coca = new Produit("coca",50);
		Produit sunny = new Produit("sunny delight", 10);
		StockBoisson monStock = new StockBoisson();
		monStock.addProduit(coca, 5);
		monStock.addProduit(sunny, 2);
		System.out.println("monStock contient il du coca?:" + monStock.containsProduit(coca));
		String[] data = monStock.getArrayProduit();
		int choix = 1;
		for(Produit p : monStock.getSetProduit()) {
			if(data[choix] == p.getNom()) {
				monStock.removeProduit(p);
			}
		}
		
				
		monStock.removeProduit();
		
		
		
	}

}
