


public class NombreEnLettreV2 {

    public static void main(String[] args) {
		String [] nombres = {"zero", "un", "deux", "trois", "quatre", "cinq", "six", "sept", "huit", "neuf", "dix", "onze", "douze", "treize", "quatorze", "quinze", "seize", "dix-sept", "dix-huit", "dix-neuf", "vingt", "vingt-et-un", "vingt-deux", "vingt-trois", "vingt-quatre", "vingt-cinq", "vingt-six", "vingt-sept", "vingt-huit", "vingt-neuf", "trente", "trente-et-un", "trente-deux", "trente-trois", "trente-quatre", "trente-cinq", "trente-six", "trente-sept", "trente-huit", "trente-neuf", "quarante", "quarante-et-un", "quarante-deux", "quarante-trois", "quarante-quatre", "quarante-cinq", "quarante-six", "quarante-sept", "quarante-huit", "quarante-neuf", "cinquante", "cinquante-et-un", "cinquante-deux", "cinquante-trois", "cinquante-quatre", "cinquante-cinq", "cinquante-six", "cinquante-sept", "cinquante-huit", "cinquante-neuf", "soixante", "soixante-et-un", "soixante-deux", "soixante-trois", "soixante-quatre", "soixante-cinq", "soixante-six", "soixante-sept", "soixante-huit", "soixante-neuf", "soixante-dix", "soixante-onze", "soixante-douze", "soixante-treize", "soixante-quartoze", "soixante-quinze", "soixante-seize", "soixante-dix-sept", "soixante-dix-huit", "soixante-dix-neuf", "quatre-vingt", "quatre-vingt-un", "quatre-vingt-deux", "quatre-vingt-trois", "quatre-vingt-quatre", "quatre-vingt-cinq", "quatre-vingt-six", "quatre-vingt-sept", "quatre-vingt-huit", "quatre-vingt-neuf", "quatre-vingt-dix", "quatre-vingt-onze", "quatre-vingt-douze", "quatre-vingt-treize", "quatre-vingt-quartoze", "quatre-vingt-quinze", "quatre-vingt-seize", "quatre-vingt-dix-sept", "quatre-vingt-dix-huit", "quatre-vingt-dix-neuf", "cent", "mille", "million"};
		String nombre = args[0];
		int number = Integer.parseInt(nombre);
		int longueur = nombre.length();
		
			System.out.println("nombre en format int : " + number);
			int number_test = number % 100;
			
			System.out.print(test);
			
			
			
/* 			
			String nombreCentaine = nombre.substring(longueur-3,longueur); //string 3 chiffres le plus a droite (centaines)
			String nombreDizaine = nombreCentaine.substring(1,3);  //string  2 chriffres le plus a droite (dizaines)
			int uniteCentaine = Integer.parseInt(String.valueOf((nombreCentaine.charAt(0))));
			
			
			String nombreCentaineMilier = nombre.substring(longueur-6,longueur-3);   // string 3 chiffres miliers
			String nombreDizaineMilier = nombreCentaineMilier.substring(1,3);  	 //string  2 chriffres le plus a droite des milliers
			int uniteCentaineMilier = Integer.parseInt(String.valueOf((nombreCentaineMilier.charAt(0)))); // conversion unité des centaine 
			
			String nombreCentaineMillion = nombre.substring(0,longueur-6);
			String nombreDizaineMillion = nombreCentaineMillion.substring(1,3);  			                   //string  2 chriffres le plus a droite (dizaines)
			int uniteCentaineMillion = Integer.parseInt(String.valueOf((nombreCentaineMillion.charAt(0)))); 
			
			
			System.out.print(nombres[uniteCentaineMillion]+ " "+ nombres[100] + " " + nombres[Integer.parseInt(nombreDizaineMillion)] + " million "); //affichage millions 
			System.out.print(nombres[uniteCentaineMilier]+ " "+ nombres[100] + " " + nombres[Integer.parseInt(nombreDizaineMilier)] + " mille ");  //affichage milliers
			System.out.print(nombres[uniteCentaine]+ " "+ nombres[100] + " " + nombres[Integer.parseInt(nombreDizaine)]);		//affichage */

		
		
		
		
	}
}



/* 
3 (0,3) et (1, 3)
4 mille
5 (0,2)
6
 */

/* Methode insertion.txt

	BufferedReader abc = new BufferedReader(new FileReader(myfile));
	List<String> lines = new ArrayList<String>();

	while((String line = abc.readLine()) != null) {
    lines.add(line);
    System.out.println(data);
	}
	abc.close();

	// If you want to convert to a String[]
	String[] data = lines.toArray(new String[]{}); */