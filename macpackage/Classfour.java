package macpackage;

public class Classfour {
	public static void main(String[] args) {
		
		int num1= 4,num2= 5;
		
		System.out.println(true||true);//finding the first true value
		System.out.println(true||false);
		System.out.println(false||true);
		System.out.println(false||false);
		
		System.out.println(12|24);//finding the first true value in binary form syart by dividing both number by two and getting dere remainder in binary a
		System.out.println(24|12);

		
		System.out.println(true&&true);//finding the first false value
		System.out.println(true&&false);
		System.out.println(false&&true);
		System.out.println(false&&false);
		
		int num=5;
		System.out.println(++num);
		System.out.println(num++);
		System.out.println(num+"\n");
		
		num=5;
		System.out.println(num++);
		System.out.println(++num);
		System.out.println(num);
		
		if (num1 % 2==0)
			System.out.println("this is an even number");
		else
			System.out.println("this is an odd number");
		
	}
}
	