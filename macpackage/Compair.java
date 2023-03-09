package macpackage;


import java.util.Scanner;

public class Compair {

	void input() {
		
		String word="java is simple".toUpperCase();;
		 Scanner scan= new Scanner(System.in);
		 System.out.print("INPUT VALUE: "); String input=scan.nextLine().toUpperCase();
		
		 
		 for (int i=0; i<word.length();) {
			 char letter=word.charAt(i);
			 
			 	
				 if (input.length()>1) { 
					 System.err.println("TOO MUCH INPUT.....");
					 break;
				  
				  
				 }else if (input.charAt(0)==word.charAt(4)) {
					 System.out.println("... JUST SPACING ...");
					 break;
					 
				 }
				 else if(letter==input.charAt(0)) {
					 System.out.println("IDENTICAL ALPHABET- "+(word.charAt(i)) );
					 
					  
				  
				 }else 
					 System.err.println("UNIDENTICAL ALPHABET- "+(word.charAt(i)) );
				 i++;
				  
				 
		 }
	}
	

	public static void main(String[] args) {
		Compair call=new Compair();
		call.input();
		

	}

}
