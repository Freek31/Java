public class EnigmaN {

    public static void main(String[] args) {
	
	 
	for(int i=0; i< args.length;i++){
		
		System.out.print(args[i]);    //affichage tableau
		}
		
		
	char codageLettre[] = new char[100];
	int n;
	const LGRALPHABET = 26;
	
	for (byte i=0;i<args[0].length();i++)
		{
			
			codageLettre[i] = (char)((int)(args[0].charAt(i)+n));  //on remplit un tableau de char avec les lettres codees
			
			
			int decallage = (int)(args[0].charAt(i)- 97)
		}
		String str = new String(codageLettre);    // on transforme le tableau de char en chaine de caractere 
		System.out.print("--->" + str);
	}
}




//97--->122 code asci a--->z