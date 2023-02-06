package macpackage;
import java.util.Scanner;

public class Hangman {
	static String user;

	
	void Promtname(String user) {
		Scanner sc= new Scanner(System.in);
		this.user=sc.nextLine();
		this.user=user;
		System.out.println("Hi "+user);
		
	}
	
	void How_to_play(String opt) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Would you like to see the istruction "+"\n"+opt);
		if (opt=="yes")
			System.out.println("(1) Player neck must be on a rope"+"\n"+"(2) "
					+ "if player loses he/she must die by strangling"+"\n"+
					"(3) player must die were no one will find dere body"
					+"\n"+"(4) if this conditions are not met you are fucked figuratively & literaly"+"\n"+"Let the game begin!");
		else if (opt=="no")
			System.out.println("Let the game begin!");
		else
			System.out.println("Invalid input");
				
		
		
	}
	void Playing(String option) {
		Scanner sc= new Scanner(System.in);
		if (option=="yes")
			System.out.println("Welcome to Hangman Game your life is on the line");
		
		else if (option=="no")
			System.out.println("Good bye "+user);
		else
			System.out.println("Invalid input");
				
	}
	
	

	public static void main(String[] args) {
		Hangman use=new Hangman();
		use.Promtname("Eniola");//players name
		
		Hangman play=new Hangman();
		play.Playing("yes"); //chose to play 
		
		Hangman instruction=new Hangman();
		instruction.How_to_play("yes");// instructions that scare user lol
		
		
		
		
		

	}

}
