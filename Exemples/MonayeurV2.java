class MonayeurV2{

   public static void main (String[]args) {
	   short nb1 = 4;
	   short nb2 = 10;
	   
	   System.out.println("minimum = " + Min(nb1, nb2));
	   System.out.println("maximum = " + Max(nb1, nb2));
	   
	   short[] valPieces = {10, 20, 50, 100, 200};
	   short[] stockPieces = {5, 5, 5, 5, 5};
	   
	   short montantInsere = 300;
	   
	   // On veut pour CHAQUE pièce, connaître le nombre maximum à rendre pour arriver au montant à rendre
	   
	   short rend2 = Min((short)(montantInsere/valPieces[4]), stockPieces[4]);
	   short rend1 = Min((short)(montantInsere/valPieces[3]), stockPieces[3]);
	   short rend050 = Min((short)(montantInsere/valPieces[2]), stockPieces[2]);
	   short rend020 = Min((short)(montantInsere/valPieces[1]), stockPieces[1]);
	   short rend010 = Min((short)(montantInsere/valPieces[0]), stockPieces[0]);
	   
	   System.out.println(rend2 + " " + rend1 + " " + rend050 + " " + rend020 + " " + rend010);
	   
	   short test = Max((short)(montantInsere/valPieces[2]), stockPieces[2]);
	   System.out.println(test);
   }
   
	   public static short Min (short a, short b){
	   short min;
	   if(a < b){
		   min = a;
	   }
	   else{
		   min = b;
	   }
	   return min;
   }
   
   public static short Max (short a, short b){
	   short max;
	   if(a > b){
		   max = a;
	   }
	   else{
		   max = b;
	   }
	   return max;
   }
   
   
}


 
for (short nbRendue = Min((short)(montantInsere/valPieces[4]), stockPieces[4]); nbRendue>=0; nbRendue--){
	short resteArendre = montantARendre 
	for (short nbRendue = Min((short)(montantInsere/valPieces[4]), stockPieces[4]); nbRendue>=0; nbRendue--){
	
		for (short nbRendue = Min((short)(montantInsere/valPieces[4]), stockPieces[4]); nbRendue>=0; nbRendue--){

			for (short nbRendue = Min((short)(montantInsere/valPieces[4]), stockPieces[4]); nbRendue>=0; nbRendue--){

				for (short nbRendue = Min((short)(montantInsere/valPieces[4]), stockPieces[4]); nbRendue>=0; nbRendue--){
	
}
}
}
}
} 