package macpackage;

public class train {
	int num1=5;
	int num2=80,
	num3;
	final static String col="Eniola";//to make a value constant
	
	void addtwonumbers() {
		System.out.println("without parameter");
		num3=num1+num2;
		System.out.println("Sum of number2 is: "+ num3+"\n");
	
	}
	void addtwonumbers(int num1,int num2) {
		System.out.println("with parameter");
		num3=num1+num2;
		System.out.println("Sum of number2 is: "+ num3+"\n");
	}
	void addtwonumbers(int num1) {
		System.out.println("with parameter");
		num3=num1+num2;
		System.out.println("Sum of number2 is: "+ num3+"\n");
		
	}
	void addtwonumbers(float num1) {
		System.out.println("with parameter");
		float num3=num1+num2;
		System.out.println("Sum of number2 is: "+ num3+"\n");
	}
	
	void display(int num1,int num2) {
		System.out.println("with parameter");
		System.out.println("First number is: "+ num1);
		System.out.println("Second number is: "+ num2+"\n");
		
	}
	static String name3= "named";
	static String name2= "anoda_name";
	static void greet(String name) {
		name2=name;
		System.out.println("hello "+ name2+"\n");
		
	}
	static void greet() {
		System.out.println("hello "+ name2+"\n");
	}
		
	
	
	void display() {
		System.out.println("First number is: "+ num1);
		System.out.println("Second number is: "+ num2+"\n");
	}
	train(){
		System.out.println("Train constructor");
		
	}
	void train(){
		System.out.println("Train method");
	}
	
	

	public static void main(String[] args) {
		new train();
		train uni=new train();
	/* train uni=constructor */
		/* classname objectname=constructor */
	/* classname objectname=new classname */
	/* train c1=new train().addtwonumbers(); */
		uni.train();
		train gon;
		new train();
		new train().addtwonumbers();
		new train().num1=6;
		
		//without parameter
		train str=new train();
		greet();
		str.greet("eniola");
		greet();
		train.greet();
		
		train aug=new train();
		aug.display();
		aug.addtwonumbers();
		
		//one parameter
		train nig=new train();
		nig.addtwonumbers(2.9f);
		
		train par=new train();
		par.addtwonumbers(2);
		
		//with parameter
		train rel=new train();
		rel.display(10,5);
		rel.addtwonumbers(10,5);
		
//-----------------------------------------------------------------------------------------------
		//NEW CLASS
		hello h2=new hello();
		
		hello h1=new hello();
		h1.sv=5;
		System.out.println("number is: "+ h1.sv);
		h2.sv=20;
		System.out.println("number is: "+ h1.sv);
		
		
		//static variables
		System.out.println(h1.sv+"+"+h2.sv+"="+(h1.sv+h2.sv));
		
		//non-static variables
		h1.nsv=5;
		System.out.println("number is: "+ h1.nsv);
		h2.nsv=20;
		System.out.println("number is: "+ h1.nsv);
		System.out.println(h1.nsv+"+"+h2.nsv+"="+(h1.nsv+h2.nsv));
		
		
		
		
	}

}
//CREATING CLASS
//---------------------------------------------------------------------------------------------------------
class hello{
	static int sv;
	int nsv;
}
