/**
 * 
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.MonModel;
import model.Pieces;

/**
 * | @Author : @Fred || 17 f�vr. 2020 || 11:45:24 | *
 *
 */
public class MonControleur implements ActionListener {
	private MonModel modele;

	/**
	 * @param modele
	 */
	public MonControleur(MonModel modele) {
		super();
		this.modele = modele;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("je reponds � la sonnette");

		switch (e.getActionCommand()) {
		case "P10":
			modele.insere(Pieces.P10.getValeur());
			break;
		case "P20":
			modele.insere(Pieces.P20.getValeur());
			break;
		case "P50":
			modele.insere(Pieces.P50.getValeur());
			break;
		case "P100":
			modele.insere(Pieces.P100.getValeur());
			break;
		case "P200":
			modele.insere(Pieces.P200.getValeur());
			break;
		case "Coca":
			modele.getMontantInsere();
			modele.getMonStock().getBoissonById().getPrix();
			break;
		case "Orangina":
			modele.insere(Pieces.P100.getValeur());
			modele.getMonStock().getBoissonById(1).getPrix();
			break;


		default:
			System.out.println("je ne sais pas quoi faire");

		}
	}
}