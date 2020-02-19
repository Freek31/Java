public class NombreEnLettre {

    public static void main(String[] args) {
		
		String[] unite = {"zero", "un", "deux", "trois", "quatre", "cinq", "six", "sept", "huit", "neuf"};
		String[] dixVingt = {"dix", "onze", "treize", "quatorze", "quinze", "seize","dix-sept", "dix-huit","dix-neuf","vingt"};
		String[] dizaine = {"dix","vingt", "trente", "quarante", "cinquante", "soixante", "soixante-dix", "quatre-vingt", "quatre-vingt-dix"};
		String[] centaines = { "cent", "mille", "million" };
		
		/* for(int i=0; i< unite.length;i++){
		
		System.out.print(unite[i]);    //affichage tableau
		} */
		String nombre = args[0];
		
		switch (args[0].length()){  // switch par rapport a la taille du chiffre
		
		case 1 : System.out.print(unite[ Integer.parseInt(nombre)]);  //taille.chiffre = 1 (nbre= 0 à 9)
		break;
		
		case 2 : if(Integer.parseInt(nombre)<20){
					System.out.print(dixVingt[ (Integer.parseInt(nombre))-11]);    //taille.chiffre = 2 (nbre= 10 à 20 else 20 a 99)
				}
				else {
					System.out.print( (dizaine[Integer.parseInt(String.valueOf((nombre.charAt(0))))-1]) + " " + (unite[Integer.parseInt(String.valueOf((nombre.charAt(1))))]));
					
				}							
		break;
		
		case 3 : System.out.print( (unite[Integer.parseInt(String.valueOf((nombre.charAt(0))))]) +" "+ centaines[0] );
				
				Integer.parseInt(String.valueOf((nombre.charAt(0))) + )
				if(Integer.parseInt(nombre)<20){
					System.out.print(dixVingt[ (Integer.parseInt(nombre))-11]);    //taille.chiffre = 2 (nbre= 10 à 20 else 20 a 99)
				}
				else {
					System.out.print( (dizaine[Integer.parseInt(String.valueOf((nombre.charAt(0))))-1]) + " " + (unite[Integer.parseInt(String.valueOf((nombre.charAt(1))))]));
					
				}	
		
		
		break;
		
		default : System.out.print("erreur");
		break;
	
		
		
		}
		
		
		
	}
	
}


/* 

23 --> on recupere dizaine '2' et on mets vingt puis les unites '3' et on mets 3

REGLES GRAMMAIRE

Orthographe des nombres
0	zéro	50	cinquante
1	un	60	soixante
2	deux	70	soixante-dix (septante)
3	trois	80	quatre-vingts (octante, huitante)
4	quatre	90	quatre-vingt-dix (nonante)
5	cinq	100	cent
6	six	1 000	mille
7	sept	10 000	dix mille
8	huit	100 000	cent mille
9	neuf	1 000 000	un million
10	dix	10 000 000	dix millions
20	vingt	100 000 000	cent millions
30	trente	1 000 000 000	un milliard
40	quarante	10 000 000 000	dix milliards
Le trait d’union n’est employé qu’entre des éléments inférieurs à  cent sauf s’ils sont unis par la conjonction et.

Ex. : vingt–quatre
Ex. : soixante–quinze
Ex. : cinquante et un */