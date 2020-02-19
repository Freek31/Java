/**
 * @author Kevin Lafon
 * @creation_date 7 f�vr. 2020
 * @last_change_date 07/02/2020 10:40:04
 */
public class Lanceur {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String messageProduit = "Quel est le prix de la boisson ?";
		String messageErreur = "Erreur de saisi, recommencez !";
		
		
		//Dans l'ordre, piece de 10, 20, 50, 100, 200 centimes
		short [] pieceStock = {5, 5, 5, 5, 5};
		//Piece [] listePiece = Piece.values();		
		short [] pieceInseree = new short[Piece.values().length];
		short montantInsere = 0;
		
		Menu monMenu = new Menu("Pieces :", Piece.listPiece());
		monMenu.afficherMenu();
		
		//Initialisation du monnayeur
		Monnayeur monnayeur = new Monnayeur (pieceStock, Piece.values());
		
		//On demande � l'utilisateur de saisir le prix d'une boisson
		short prixBoisson = GestionSaisie.saisieInfo(messageProduit, messageErreur);
		
		//On demande � l'utilisateur de saisir le nombre de piece(s) de chaque type qu'il insere
		for(byte i = 0 ; i < pieceInseree.length ; i++)
		{
			pieceInseree[i] = GestionSaisie.saisieInfo("Combien de "+Piece.values()[i].getNom()+" voulez-vous ins�rer ?", messageErreur);
			montantInsere += pieceInseree[i]*Piece.values()[i].getValeur();
		}
		
		
		InterfaceHommeMachine.afficherMessage("prix boisson : "+prixBoisson);
		InterfaceHommeMachine.afficherMessage("montant ins�r� : "+montantInsere);
		
		//Diff�rents traitement en fonction du montant ins�r�		
		
		if (montantInsere == prixBoisson)
		{
			monnayeur.ajouterAuStock(pieceInseree); //MaJ du stock de pi�ces
			InterfaceHommeMachine.afficherMessage("Prenez votre boisson !");
		}
		
		else if(montantInsere > prixBoisson)
		{
			monnayeur.ajouterAuStock(pieceInseree); //MaJ du stock de pi�ces
			short[] monnaie = monnayeur.rendreMonnaie(montantInsere, prixBoisson); //On r�cup�re le type et le nombre de pi�ce(s) � rendre
			switch(monnaie[0])
			{
			case -1: //Si le monnayeur n'a pas trouv� de combinaison (cas exceptionnel)
				InterfaceHommeMachine.afficherMessage("Probl�me de monnaie, r�cup�rez la votre !");
				monnayeur.retirerAuStock(pieceInseree);
				InterfaceHommeMachine.afficherMessage("Vous r�cup�rez : ");
				for(byte i = 0 ; i < pieceInseree.length ; i++)
				{
					InterfaceHommeMachine.afficherMessage(pieceInseree[i]+" "+Piece.values()[i].getNom());
				}
				break;
			default: //cas normal (une combanaison a �t� trouv�)
				monnayeur.retirerAuStock(monnaie); //MaJ du stock de pi�ces
				InterfaceHommeMachine.afficherMessage("Vous r�cup�rez : ");			
				//Affichage de la monnaie rendue
				for(byte i = 0 ; i < monnaie.length ; i++)
				{
					InterfaceHommeMachine.afficherMessage(monnaie[i]+" "+Piece.values()[i].getNom());
				}
				InterfaceHommeMachine.afficherMessage("Prenez votre boisson !");
			}			
		}
		
		else //Si le montant ins�r� est inf�rieur au pris de la boisson
		{
			InterfaceHommeMachine.afficherMessage("Vous n'avez pas ins�r� assez de monnaie pour cette boisson !");
		}
	}
}
