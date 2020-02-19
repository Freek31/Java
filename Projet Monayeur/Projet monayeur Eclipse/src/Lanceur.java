import java.util.*;

import model.Monayeur;
import model.Phrase;
import model.Pieces;
import model.Services;
/**
 * | @Author : @Fred || 10 f�vr. 2020 || 08:42:45 | *
 */

public class Lanceur {
	public static void main(String[] args) {
		
		//Initialisations
		short[] stockPieces = { 0, 0, 0, 0, 0 }; 
		short[] pieceInseree = { 0, 0, 0, 0, 0 };
		short montantInsere = 0;
	
		
		//**Affichage menu**//
		/*Menu monMenu= new Menu ("Menu des boissons", Distributeur.collection());
		monMenu.afficherMenu();*/
		
		
		//Phrase.Affichage("Bonjour! Donner le prix de la boisson :"); 
		short prixBoisson = Services.VerifShort(); //verification sil sagit dun prix correct
		
		//**Affichage insertion des pieces + Calcul du montant inser� + mise a jour du stock**// 
		do {
			for (byte i = 0; i < stockPieces.length; i++) {
				Phrase.Affichage("Donner vos pieces de : " + Pieces.values()[i].getValeur() + "cts "); //peutetre mettre cette partie dans monayeur
				pieceInseree[i] = Services.VerifShort();
				montantInsere += pieceInseree[i] * (Pieces.values()[i].getValeur());
				stockPieces[i] += pieceInseree[i];
			}
			if(montantInsere<prixBoisson) {
				Phrase.Affichage("Pas assez de pieces inser�e, veuillez recommencer : \n"); 
			}
		}while(montantInsere<prixBoisson);// verification du montant inser�
		
		//Calcul de la monnaie a rendre 
		boolean result = Monayeur.CalculMonnaieARendre(montantInsere, stockPieces, prixBoisson); 
		if (!result) {
			Phrase.Affichage("La machine est incapable de rembourser la totalit� sur loperation demand�. Veuillez recuperer vos pieces inser�es"); // instancier le monayeur??
		}	
	}
}
