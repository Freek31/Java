
public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stocker<Piece> monnayeur = new Stocker<Piece>();
		monnayeur.addItem(new Piece("10cts",10));
		
		System.out.println(monnayeur.getItemById(1).getValeur());
		
		Stocker<Produit> rack = new Stocker<Produit>();
		rack.addItem(new Produit(1,"coca", 0,60));
		rack.addItem(new Produit(2,"sprite", 0,80));
		
		System.out.println(rack.getItemById(2).getNom());
			
	}

}
