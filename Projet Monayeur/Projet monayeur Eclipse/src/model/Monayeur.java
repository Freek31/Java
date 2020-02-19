package model;

/**
 * | @Author : @Fred || 10 f�vr. 2020 || 11:36:52 | *
 */
public class Monayeur {
	public static boolean CalculMonnaieARendre(short montantInsere, short[] stockPieces, short prixBoisson) {
		//Initialisations
		short montantARendre = (short) (montantInsere - prixBoisson);
		short resteARendre = montantARendre;
		boolean validation = false; // La machine peut pas rendre l'argent si false!

		// On calcule le nombre de pieces a rendre en favorisant les plus grosses pieces
		for (short nbRendue200 = Services.Min((short) (montantInsere / Pieces.values()[4].getValeur()),
				stockPieces[4]); (nbRendue200 >= 0) && (validation == false); nbRendue200--) {
			resteARendre = (short) (montantARendre - (nbRendue200 * Pieces.values()[4].getValeur()));// le reste � rendre, le montant � rendre moins ce que j'ai d�ja rendu

			for (short nbRendue100 = Services.Min((short) (resteARendre / Pieces.values()[3].getValeur()),
					stockPieces[3]); nbRendue100 >= 0; nbRendue100--) {
				resteARendre = (short) (montantARendre - (nbRendue200 * Pieces.values()[4].getValeur()
						+ nbRendue100 * Pieces.values()[3].getValeur()));

				for (short nbRendue050 = Services.Min((short) (resteARendre / Pieces.values()[2].getValeur()),
						stockPieces[2]); nbRendue050 >= 0; nbRendue050--) {
					resteARendre = (short) (montantARendre - (nbRendue050 * Pieces.values()[2].getValeur()
							+ nbRendue200 * Pieces.values()[4].getValeur()
							+ nbRendue100 * Pieces.values()[3].getValeur()));

					for (short nbRendue020 = Services.Min((short) (resteARendre / Pieces.values()[1].getValeur()),
							stockPieces[1]); nbRendue020 >= 0; nbRendue020--) {
						resteARendre = (short) (montantARendre - (nbRendue050 * Pieces.values()[2].getValeur()
								+ nbRendue200 * Pieces.values()[4].getValeur()
								+ nbRendue100 * Pieces.values()[3].getValeur()
								+ nbRendue020 * Pieces.values()[1].getValeur()));

						for (short nbRendue010 = Services.Min(
								(short) (resteARendre / Pieces.values()[0].getValeur()),
								stockPieces[0]); nbRendue010 >= 0; nbRendue010--) {
							resteARendre = (short) (montantARendre - (nbRendue010 * Pieces.values()[0].getValeur()
									+ nbRendue050 * Pieces.values()[2].getValeur()
									+ nbRendue200 * Pieces.values()[4].getValeur()
									+ nbRendue100 * Pieces.values()[3].getValeur()
									+ nbRendue020 * Pieces.values()[1].getValeur()));

							// Affichage du nombre de chacune des pieces rendues
							if (resteARendre == 0) {
								Phrase.Affichage("Le distributeur vous rend " + nbRendue200 + " piece(s) de 2euro, "
										+ nbRendue100 + " piece(s) de 1euro, " + nbRendue050 + " piece(s) de 50 cts,  "
										+ nbRendue020 + " piece(s) de 20cts et " + nbRendue010 + " piece(s) de 10 cts");
								validation = true; // Super la machine peut rendre l'argent!
							}
						}

					}

				}

			}

		}

		return (validation);
	}
}
