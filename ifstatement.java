import java.util.Scanner;
public class ifstatement {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number: "); int num1=Integer.parseInt(sc.nextLine());
		
	if (num1 % 2==0)
		System.out.println("this is an even number");
	else
		System.out.println("this is an odd number");
	}
}
