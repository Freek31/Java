public class Enigma {

    public static void main(String[] args) {
	
	 
	for(int i=0; i< args.length;i++){
		
		System.out.print(args[i]);    //affichage tableau
		}
	char codageLettre[] = new char[100];
	
	
	for (byte i=0;i<args[0].length();i++)
		{
			codageLettre[i] = (char)((int)(args[0].charAt(i)+1));  //on remplit un tableau de char avec les lettres codees
			
		}
		String str = new String(codageLettre);    // on transforme le tableau de char en chaine de caractere 
		System.out.print("--->" + str);
	}
}

