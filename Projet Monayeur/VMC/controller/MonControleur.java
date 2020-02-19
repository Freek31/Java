/**
 * 
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.MonModel;

/**
 * @author 1501224
 *
 */
public class MonControleur implements ActionListener {
	
	MonModel modele;
	

	/**
	 * @param modele
	 */
	public MonControleur(MonModel modele) {
		super();
		this.modele = modele;
	}


	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("je reponds � la sonnette");
		if (e.getActionCommand()=="menfous") {
			modele.TraitementBA();
		}
		
		if (e.getActionCommand()=="comprandpo") {
			modele.TraitementBB();
		}


	}

}
