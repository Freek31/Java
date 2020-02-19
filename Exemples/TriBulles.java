public class TriBulles {

    public static void main(String[] args) {
        
		//Declarations
		 
		int varEchang ;
		int tab[] = {3,2,4,9,7,5};
	
		/*for(int i=0; i< tab.length;i++){
		
		System.out.print(tab[i]+ ' ');    //affichage tableau non trié
		}*/
		
		
		//tri_à_bulles_optimisé(Tableau T)	
		boolean tab_trie = true;
		while(tab_trie){    //pendant que cest pas trié
			tab_trie = false;					   //tableau_trié := vrai
				for(int j=0 ; j<tab.length-1; j++){ //pour j allant de 0 à i-1
					if(tab[j+1] < tab[j]){         //si T[j+1] < T[j]
						varEchang = tab[j+1];
						tab[j+1] = tab[j];		   //échanger(T[j+1], T[j])
						tab[j] = varEchang;
						tab_trie = true; 			   //tableau_trié := faux
					}
		
				}
			
			}
		
		for(int i=0; i< tab.length;i++){
		
		System.out.print(tab[i]+ ' ');    //affichage tableau trié
		}
		  
	}
		
		
}


