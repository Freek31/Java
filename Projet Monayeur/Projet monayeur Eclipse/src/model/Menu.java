package model;

/**
 * @author 31010-83-11
 *
 */
public class Menu {

	/*****Propri�t�s*****/
	private String titre;
	private String[] choix;
	
	/*****Constructeur*****/
	/**
	 * @param titre
	 * @param choix
	 */
	public Menu(String titre, String[] choix) {
		this.titre = titre;
		this.choix = choix;
	}
	
	/*****Accesseurs*****/
	/**
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}
	/**
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}
	/**
	 * @return the choix
	 */
	public String[] getChoix() {
		return choix;
	}
	/**
	 * @param choix the choix to set
	 */
	public void setChoix(String[] choix) {
		this.choix = choix;
	}
	
	/*****M�thodes*****/
	public void afficherMenu()
	{
		Phrase.Affichage(this.titre);
		for(byte i = 0 ; i < this.choix.length ; i++)
		{
			Phrase.Affichage((i+1)+" "+this.choix[i]);
		}
		Phrase.Affichage("0 Quitter");
	}
}
