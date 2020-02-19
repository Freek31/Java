import java.util.Scanner;

/**
 * 
 */

/**
 * @author Kevin Lafon
 * @creation_date 7 févr. 2020
 * @last_change_date 07/02/2020 10:53:08
 */
public class GestionSaisie {
	public static short saisieInfo (String message, String messageErreur)
	{
		Scanner scan = new Scanner(System.in);
		
		short saisie;
		do //Tant que la saisie n'est pas de type short ET strictement supérieure à 0
		{
			InterfaceHommeMachine.afficherMessage(message);
			while(!scan.hasNextShort())
			{
				InterfaceHommeMachine.afficherMessage(messageErreur);
				InterfaceHommeMachine.afficherMessage(message);
				scan.next();
			}
			saisie = scan.nextShort();
		}while(saisie < 0);
		
		//scan.close();
		
		return saisie;
	}

}
