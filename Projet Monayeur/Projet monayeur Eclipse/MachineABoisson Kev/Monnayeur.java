/**
 * @author Kevin Lafon
 * @creation_date 7 févr. 2020
 * @last_change_date 07/02/2020 11:06:40
 */
public class Monnayeur {
	/*****Propriétés*****/
	private short [] stock;
	private Piece [] listePieces;
	
	
	/*****Constructeur*****/
	/**
	 * @param stock
	 */
	public Monnayeur(short [] stock, Piece[] listePieces) //Constructeur
	{
		this.stock = stock;
		this.listePieces = listePieces;
	}
	
	/*****Accesseurs*****/
	/**
	 * @return the stock
	 */
	public short[] getStock() 
	{
		return stock;
	}
	/**
	 * @param stock the stock to set
	 */
	public void setStock(short indice, short quantite) 
	{
		this.stock[indice] += quantite;
	}
	
	public void setFullStock(short quantite) 
	{
		for (byte i = 0 ; i < this.stock.length ; i++)
		{
			this.stock[i] = quantite;
		}		
	}

	/**
	 * @return the valeurAccepte
	 */
	public Piece[] getListePieces() {
		return listePieces;
	}

	/**
	 * @param valeurAccepte the valeurAccepte to set
	 */
	/*public void setListePieces(Piece[] valeurAccepte) {
		this.listePieces = valeurAccepte;
	}*/
	
	/*****Méthodes*****/
	/**
	 * @param monnaieAStocker
	 * Methode mettant à jour le stock avec les pieces inserées par un utilisateur
	 */
	public void ajouterAuStock (short[] monnaieAStocker)
	{
		for(byte i = 0 ; i < monnaieAStocker.length ; i++)
		{
			stock[i] += monnaieAStocker[i];
		}
	}
	/**
	 * @param monnaieARendre
	 * Methode mettant à jour le stock après avoir rendu la monnaie à un utilisateur
	 */
	public void retirerAuStock (short[] monnaieARendre)
	{
		for(byte i = 0 ; i < monnaieARendre.length ; i++)
		{
			stock[i] -= monnaieARendre[i];
		}
	}
	
	/**
	 * @param montantInsere
	 * @param prixBoisson
	 * @return
	 * Méthode permettant de calculer le nombre et le type de pièces à rendre
	 */
	public short[] rendreMonnaie(short montantInsere, short prixBoisson)
	{
		float aRendre = montantInsere - prixBoisson;
		float cumul = 0;
		
		short [] combinaison = {-1, -1, -1, -1, -1};
		
		short rend200 = MinMax.Min((short)(montantInsere/getListePieces()[4].getValeur()), stock[4]);
		short rend100 = MinMax.Min((short)(montantInsere/getListePieces()[3].getValeur()), stock[3]);
		short rend50 = MinMax.Min((short)(montantInsere/getListePieces()[2].getValeur()), stock[2]);
		short rend20 = MinMax.Min((short)(montantInsere/getListePieces()[1].getValeur()), stock[1]);
		short rend10 = MinMax.Min((short)(montantInsere/getListePieces()[0].getValeur()), stock[0]);		

		
		for(short p200 = rend200 ; p200 >= 0 ; p200--)
		{			
			for(short p100 = rend100 ; p100 >= 0 ; p100--)
			{				
				for(short p50 = rend50; p50 >= 0 ; p50--)
				{					
					for(short p20 = rend20; p20 >= 0 ; p20--)
					{						
						for(short p10 = rend10; p10 >= 0 ; p10--)
						{
							cumul = (short)(p200*getListePieces()[4].getValeur()+
											 p100*getListePieces()[3].getValeur()+
											 p50*getListePieces()[2].getValeur()+
											 p20*getListePieces()[1].getValeur()+
											 p10*getListePieces()[0].getValeur());
							if (cumul == aRendre)
							{
								combinaison[0] = p10;
								combinaison[1] = p20;
								combinaison[2] = p50;
								combinaison[3] = p100;
								combinaison[4] = p200;
								return combinaison;								 	
							}
						}
					}
				}
			}
		}
		
	return combinaison;
	}	

	
}
