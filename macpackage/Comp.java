package macpackage;

import java.util.Scanner;

public class Comp {

	void input() {
		int i;

		String word = "java is simple".toUpperCase();
		;
		Scanner scan = new Scanner(System.in);
		System.out.print("INPUT VALUE: ");
		String input = scan.nextLine().toUpperCase();

		boolean found = false;
		for (i = 0; i < word.length();i++) {
			char letter = word.charAt(i);

			if (input.length() > 1) {
				System.err.println("TOO MUCH INPUT.....");
				break;

			} else if (letter == input.charAt(0)) {
//						 System.out.println("IDENTICAL ALPHABET- "+(word.charAt(i))+" @ index "+i );
				found = true;
				break;

			}
			

		}
		if (found == true) {
			System.out.println("Letter " + input + " is present at index "+i);

		} else
			System.out.println("Letter is not present");
	}

	public static void main(String[] args) {
		Comp call = new Comp();
		call.input();

	}

}
