package macpackage;

public class Looping {

	public static void main(String[] args) {
		for (int j=1; j<=5; j++) {
			for (int i=1; i<=j; i++) {
				System.out.print(j);
			}
			System.out.println();
		}
//		for (int j=1; j<=5; j++) {
//			if (j % 2 ==0)
//				System.out.println("a is: "+ j);
//			else
//				
//				System.out.println("b is: "+ j);
//		}
	}
	

}
