class Lettre {
	
   public static void main (String[]args) {
	   
	   // Je récupère l'argument entré en paramètre et l'intègre à une variable String nombreAModifier:
	   String nombreAModifier=args[0];
	   
	   // Je calcule la longueur de mon nombre pour pouvoir la comparer ensuite :
	   int longueurNombre=nombreAModifier.length();
	   
	   // Je convertis le paramètre récupéré dans une variable de type string en une variable de type Int :
	   int conversionEntier = Integer.parseInt(nombreAModifier);
	   
	   // Je déclare un tableau qui comprendra les chiffres compris entre 0 et 99, écrit en lettres:
	   String ZeroAQuatreVingtDixNeuf[]={"", "un", "deux", "trois", "quatre", "cinq", "six", "sept", "huit", "neuf", "dix", "onze", "douze", "treize", "quatorze", "quinze", "seize", "dix-sept", 
	   "dix-huit", "dix-neuf", "vingt", "vingt-et-un", "vingt-deux", "vingt-trois", "vingt-quatre", "vingt-cinq", "vingt-six", "vingt-sept", "vingt-huit", "vingt-neuf", 
	   "trente", "trente-et-un", "trente-deux", "trente-trois", "trente-quatre", "trente-cinq", "trente-six", "trente-sept", "trente-huit", "trente-neuf", 
	   "quarante", "quarante-et-un", "quarante-deux", "quarante-trois", "quarante-quatre", "quarante-cinq", "quarante-six", "quarante-sept", "quarante-huit", "quarante-neuf", 
	   "cinquante", "cinquante-et-un", "cinquante-deux", "cinquante-trois", "cinquante-quatre", "cinquante-cinq", "cinquante-six", "cinquante-sept", "cinquante-huit", "cinquante-neuf", 
	   "soixante", "soixante-et-un", "soixante-deux", "soixante-trois", "soixante-quatre", "soixante-cinq", "soixante-six", "soixante-sept", "soixante-huit", "soixante-neuf", 
	   "soixante-dix", "soixante-onze","soixante-douze","soixante-treize","soixante-quatorze","soixante-quinze", "soixante-seize", "soixante-dix-sept", "soixante-dix-huit","soixante-diz-neuf",
	   "quatre-vingt","quatre-vingts-un", "quatre-vingts-deux", "quatre-vingts-trois", "quatre-vingts-quatre","quatre-vingts-cinq","quatre-vingts-six","quatre-vingts-sept","quatre-vingts-huit","quatre-vingts-neuf",
	   "quatre-vingt-dix", "Quatre-vingt-Onze", "Quatre-vingt-Douze", "Quatre-vingt-Treize", "Quatre-vingt-Quatorze", "Quatre-vingt-Quinze", "Quatre-vingt-Seize", "Quatre-vingt-Dix-sept", "Quatre-vingt-Dix-huit", "Quatre-vingt-Dix-neuf"};
	   
	   String separateurDeMillier[]={"","mille","million","milliard"};
	   
	   String entreZeroEtQuatreVingtDixNeuf=""; // Je déclare et initialise une variable qui comprendra les chiffres en lettres de 0 à 99:
	   String centaine=""; 						// Je déclare une variable qui contiendra en lettres les centaines :
	   String nombreAfficher="";				// Je déclare une variable qui me permettra d'afficher l'ensemble du nombre en lettres :
	   
	   int increment=0;							// Je déclare une variable d'incrémentation pour ma boucle while :
	   String unite=" "; 						// Je déclare une variable qui me permettra d'afficher l'unité dans laquelle je me trouve :
	   
	   // Tant que mon nombre entré en paramètre n'est pas égal à 0 :
	   while(conversionEntier!=0){
		   
			
			int deuxDerniersChiffres=conversionEntier%100;  // J'applique un modulo cent à mon paramètre d'entrée pour récupérer les deux derniers chiffres :
			
			/* 
			Ici je vais traiter les centaines
			*/
			int divisionCent=conversionEntier%1000; 		// Via le modulo 1000, je récupère les 3 derniers chiffres du nombre :
			int Cent=divisionCent/100;						// Je divise par cent pour récupérer la centaine:
			
			// 0 j'affiche rien, 1 j'affiche cent, dans tous les autres cas j'affiche le chiffre et cent:
			switch (Cent) {
				case 0:  
					centaine = "";
                    break;
				case 1:  
					centaine ="cent";
					break;
				default: 
					centaine = ZeroAQuatreVingtDixNeuf[Cent]+" "+"cent";
					break;
			}
			
			// On gère les milliers avec ce switch-case : 0 j'affiche rien, 1 j'affiche mille, dans tous les autres cas j'affiche le chiffre et mille :
			switch (increment) {
				case 0:  
					unite = "";
                    break;
				case 1:  
					if(divisionCent>=1){
						unite = separateurDeMillier[increment];
					}
					break;
				default: 
					if(divisionCent>=1){
						unite = separateurDeMillier[increment];
					}
					unite = separateurDeMillier[increment]+"s";
					break;
			}
						
			// Ma variable qui affiche le résultat comprend à chaque fois les 3 derniers chiffres en lettres de mon nombre + l'unité associé si nécessaire + le contenu de la variable précédent :
			nombreAfficher = centaine+" "+ ZeroAQuatreVingtDixNeuf[deuxDerniersChiffres]+" "+unite+" "+nombreAfficher;	
			
			// Je divise mon nombre en entrée par 1000 pour accéder à la centaine suivante que je vais traiter dans le prochain tour de boucle :
			conversionEntier=conversionEntier/1000;
			
			increment++;
		 
	   }
	   
	   System.out.println(nombreAfficher);
		
	}	
			   	   
}
   
