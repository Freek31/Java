package model;

import java.util.Observable;

public class MonModel extends Observable {

	/**
	 * 
	 */
	public MonModel() {
		this.messageBoutonA = "Bouton A cliqu�";
		this.messageBoutonB = "Bouton B cliqu�";
		
		this.message = "";
		
	}

	private String messageBoutonA;
	private String messageBoutonB;
	
	private String message;
	/**
	 * @param messageBoutonA
	 * @param messageBoutonB
	 */
	public MonModel(String messageBoutonA, String messageBoutonB) {
		super();
		this.messageBoutonA = "Bouton A cliqu�";
		this.messageBoutonB = "Bouton B cliqu�";
		
		this.message = "";
	}
	/**
	 * @return the messageBoutonA
	 */
	public String getMessageBoutonA() {
		return messageBoutonA;
	}
	/**
	 * @param messageBoutonA the messageBoutonA to set
	 */
	public void setMessageBoutonA(String messageBoutonA) {
		this.messageBoutonA = messageBoutonA;
	}
	/**
	 * @return the messageBoutonB
	 */
	public String getMessageBoutonB() {
		return messageBoutonB;
	}
	/**
	 * @param messageBoutonB the messageBoutonB to set
	 */
	public void setMessageBoutonB(String messageBoutonB) {
		this.messageBoutonB = messageBoutonB;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	private void notifierLesChangements() {
		// j'ai fait un traitement, des modifs -> je dois prevenir ceux qui me regardent
		setChanged();
		notifyObservers();
	}
	
	// METHODES METIER
	public void TraitementBA() {
		setMessage(this.messageBoutonA);
		notifierLesChangements();
		System.out.println("BA");
	}
	
	public void TraitementBB() {
		setMessage(this.messageBoutonB);
		notifierLesChangements();
		System.out.println("BB");
	}
	
	
	
}
