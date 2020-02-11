public class HelloWorld {

    public static void main(String[] args) {
        
		//Declarations
		char [] var;
		byte i;
		// Prints "Hello, World" to the terminal window.
		
		if(args.length>=2){
				System.out.println("Hello " + args[0] + " " + args[1]);
		}
		else System.out.println("erreur : il faut min 2 params");
		
		for(i=0; i< args.length;i++){
		
		System.out.print(args[i]+ ' ');
		}
		
		
    }

}
