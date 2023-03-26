package macpackage;

import java.util.Scanner;

public class Changes {

	void accept() {
		Scanner scan = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		String input;
		String inp=null;
		String done;


		String[] key = new String[] { "U", "L", "C", "R", "Z" };

		System.out.println("KEY WORDS-- U-L-R-C-Z -- \n");
		System.out.print("INPUT A SENTENCE: ");
		input = scan.nextLine().toLowerCase();
		int len = input.length();

		System.out.print("INPUT KEY WORD: ");
		done = scan.next().toUpperCase();

		if (done.charAt(0) == key[0].charAt(0))
			System.out.print("CAPITALIZED INPUT: "+input.toUpperCase());

		else if (done.charAt(0) == key[1].charAt(0))
			System.out.println("LOWCASE INPUT: "+input.toLowerCase());

		if(done.charAt(0) == key[2].charAt(0))
			System.out.println("INPUT FIRST LETTER & SECOND LETTER: ");
			inp = scan.next().toLowerCase();
			
		for (int i = 0; i >= len; i++) {
			System.out.println(input.charAt(len-1));
			char fst=inp.charAt(0) ;
			
			char snd=inp.charAt(1) ;
			if(input.charAt(i)==fst)
				snd=input.charAt(i);
		}
		System.out.println(input.toUpperCase());
		if (done.charAt(0) == key[3].charAt(0))
			for (int r = len; r > 0; r--) {
				
				System.out.print(input.charAt(r-1));
			}

	}

	public static void main(String[] args) {
		Changes call = new Changes();
		call.accept();

	}

}
