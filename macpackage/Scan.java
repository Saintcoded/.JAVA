package macpackage;

import java.util.Scanner;
import java.util.Random;

public class Scan {
	public static void main(String[] args) {
		
		/*
		 * System.out.println("start"); Scanner sc= new Scanner(System.in);
		 * 
		 * System.out.print("Enter name: "); String name=sc.nextLine();
		 * System.out.println("My name is "+ name);
		 * 
		 * System.out.println("Enter age: "); int age=sc.nextInt();
		 * System.out.println("Age is "+ age); sc.nextLine();
		 * 
		 * System.out.print("Enter Course: "); String course=sc.nextLine();
		 * System.out.println("My name is "+ course);
		 * 
		 * System.out.println("Enter gpa: "); Double
		 * gpa=Double.parseDouble(sc.nextLine()); System.out.println("Age is "+ gpa);
		 * 
		 * System.out.println("Enter age: "); int num=Integer.parseInt(sc.nextLine());
		 * System.out.println("Age is "+ age);
		 */
		
		Random rnd=new Random();
		int nnum=rnd.nextInt();
		System.out.println(nnum);
		System.out.println(rnd.nextInt());
		System.out.println(rnd.nextInt(16, 50));
		System.out.println(rnd.nextInt(15));
		
		System.out.println("end");
		
	}

	

}
