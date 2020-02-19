public class Monayeur {


    public static void main(String[] args) {
	/*
	Machine a boissons :
	- accepte les pieces de 10, 20, 50 cts et 1$ et 2$ dans les arguments
	- creer et gerer un stock : stock initial 5 pieces de chaque type
	- rendre la monaie avec les pieces dispo
	- Creer 2 foncions Min(a,b) et Max(a,b) qui retournent le min et max des 2 chiffres en para
	
	exemple de cas :     60 cts | qt 10cts | qt 20cts | qt 50cts | qt 1eur | qt 2eur |
							    |     2    |     0    |     1    |    0    |    0    |
										 
						       ARGENT RENDU : 10cts						   
	*/	

	//Declarations
	int QuantitePiecesPayee[] = new int [5]; 	// creation table avec pieces payes par le client
	int stockPieces[] = {0,5,3,2,0}; 			//stock INITIAL pieces machine
	int ValeurPieces[] = {10,20,50,100,200};	//Valeur des pieces dispo
	int size = args.length;						//longueur tab
	int prixBoisson = Integer.parseInt(args[0]); 	//Prix de la boisson
	int QuantitePiecesARendre[] = {0,0,0,0,0};   
	
	// remplit la table pieces données par le client et on mets a jour le stock
	if (size<7){
		for (byte i=0;i<size-1;i++){
		QuantitePiecesPayee[i] = Integer.parseInt(args[i+1]);
		stockPieces[i] += QuantitePiecesPayee[i];
		System.out.println(stockPieces[i]);
		}
	}else{
		System.out.print("ERREUR : Veuillez rentrez les quantites des pieces de la facon suivante : | qt 10cts | qt 20cts | qt 50cts | qt 1eur | qt 2eur |");
	}

	//calcul du nombre total de pieces et de largent a rendre
	int totalPieces = 0;
	for (byte j=0;j<size-1;j++){
		totalPieces += (QuantitePiecesPayee[j]*ValeurPieces[j]);      // Calcul du prix total de laddition des pieces donnees par le client en CENTIMES
	}
	int argentARendre = totalPieces - prixBoisson;  

							//--Systeme de remboursement--//
	// (1) : Calcule la quantite de pieces a rendre de facon prioritaire au plus gros 
	if (argentARendre<0){
		System.out.println("Argent inserer n'est pas suffisant ");
	}
	else{
		
		System.out.println("Quantite pieces à rendre : ");
		System.out.println("Somme totale a rendre : " + argentARendre +" cts");
		
			for (byte k=4;k>=0;k--){
				int cptNombrePiecesChaqueTypeARendre=0;
				System.out.println(stockPieces[k]);
				while((argentARendre - ValeurPieces[k])>=0 && (stockPieces[k]>0) ){
						argentARendre = argentARendre - ValeurPieces[k];
						cptNombrePiecesChaqueTypeARendre++;
						stockPieces[k]--;
						
				}
				QuantitePiecesARendre[k] = cptNombrePiecesChaqueTypeARendre;
				System.out.println( "Piece de "+ValeurPieces[k] +"cts = " + QuantitePiecesARendre[k]);
			}
			
		
	
	 if (argentARendre!=0){
		System.out.println("erreur : le distributeur est trop pauvre!");

		for (byte i=0;i<size-1;i++){
		stockPieces[i] -= QuantitePiecesPayee[i];
		System.out.println(stockPieces[i]);
		}
	} 
	// (2) : Calcule la quantite de pieces a rendre par rapport au stock disponible
	
	
	
	
	}

	}	
}
