package model;
import java.util.Scanner;
/**
 * | @Author : @Fred || 10 févr. 2020 || 08:38:20 | *
 */
public class Services {

	//Calcule le min de 2 short
	public static short Min(short a, short b) {
		short min;
		if (a < b) {
			min = a;
		} else {
			min = b;
		}
		return min;
	}
	
	//Calcule le max de 2 short
	public static short Max(short a, short b) {
		short max;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		return max;
	}

	//Saisis au clavier et verification si digit
	public static short VerifShort() {
		String digit = "\\d+";
		Scanner scanner = new Scanner(System.in); // on instancie un scanner
		String s;
		boolean continuer = true;

		do {
			s = scanner.next();
			if (s.matches(digit)&&(Integer.parseInt(s)%10==0)) {
				continuer = false;
			} else
				System.out.println("Il faut donner un nombre! Veuillez ressaisir :");
		} while (continuer);
	return Short.parseShort(s);
	}
}

