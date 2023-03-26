package macpackage;

import java.util.Scanner;
import java.util.Arrays;

public class Arred {

//	void arr() {
//		int[]nums= {13,34,55,54,77,231};
//		
//		int marks[];
//		marks = new int[] { 13, 245, 66, 78, 44, 121 };
//		marks[4]=45;
////		System.out.println("array"+Arrays.toString(nums));
//		System.out.println((marks.length));
//		System.out.println((marks[4]));
//	}

	void acceptarray() {
		Scanner scan = new Scanner(System.in);
		int input;

		System.out.print("HOW MANY COURSE ARE U TAKING: ");
		input = scan.nextInt();
		String[] course = new String[input];
		int[] scores = new int[input];

		for (int i = 1; i <= input; i++) {
			System.out.print("COURSE NAME " + i + ":" + "\n");
			course[i - 1]  = scan.next().toUpperCase();
//			course[i - 1] = Course;

			System.out.print("SCORE FOR " + course[i - 1] + ":");
			scores[i - 1] = scan.nextInt();
//			scores[i - 1] = score;

			if (i >= input) {
				System.out.println("SCORE OBTAINED FOR "+ course[i]+" IS:" + (scores[0]));
//				System.out.println("SCORE OBTAINED FOR IS:"+(scores[1]));

//				for (int l = 0; l <= input; l++) {
//					String grade;
//					scores[l]=score;
//					if (score >= 100)
//						grade = "BOSS";
//
//					else if (score >= 70)
//						grade = "A1";
//
//					else if (score >= 65)
//						grade = "B2";
//
//					else if (score >= 50)
//						grade = "C5";
//
//					else if (score >= 30)
//						grade = "D4";
//
//					else
//						grade = "F9";
//
//					System.out.println("YOUR GRADE IS " + grade);
//				}
			}

		}
	}

	

	public static void main(String[] args) {
		Arred call = new Arred();
//		call.arr();
		call.acceptarray();
	}

}
