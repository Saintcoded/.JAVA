package HANGMAN;

import java.util.Scanner;
public class Hangman2 {
	public void menu() {
		System.out.println("....WELCOME TO HANGMAN....."+"\n");
		System.out.println("1. ....Play Game.....");
		System.out.println("2. ...View Instruction....");
		System.out.println("3. ....Exit game....."+"\n");
	}
	 void playgame() {
		System.out.println("play game has been called!");
	}
	 void viewinstruction() {
		System.out.println("view instruction has been called!");
	}
	 void exitgame() {
		System.out.println("exit game has been called!");
	}
	 void called() {
		menu();
		
		Scanner sc= new Scanner(System.in);
		System.out.print("CHOOSE AN OPTION: ");
		int call = sc.nextInt();
		
		switch (call) {
		case 1:
			playgame();
			 break;
		case 2:
			viewinstruction();
			break;
		case 3:
			exitgame();
			break;
		default:
			System.err.println("INVALID INPUT");	
		}
		
//		if ( call==3 )
//			exitgame();
//		else if( call==1 )
//			playgame();
//		else if( call==2 )
//			viewinstruction();
//		else
//			System.err.println("INVALID INPUT");
//			
	}
	
	public static void main(String[] args) {
		Hangman2 calll=new Hangman2();
		calll.called();
		
	}
}
