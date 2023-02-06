package macpackage2;//package name

import macpackage.Class;

public class _class {
	int num1=5;
	int num2=80,
	num3;
	static String col="Eniola";//for static it changes the value for col on every object if changed
	void addition() {
		num1=30;
		num2=8;
		System.out.println("ADDITION");
		System.out.println("30 Plus 8");
		System.out.println(num1+num2+"\n");
	}
	void minus()/* Declaration */{
		num1=6;
		num2=19;
		System.out.println("SUBTRACTION");
		System.out.println("6 Minus 19");
		System.out.println(num1-num2+"\n");
		
	}
	void multiplication() {
		System.out.println("MULTIPLICATION");
		System.out.println("4 Multiplied by 29");
		System.out.println(num1*num2+"\n");
	}
	void division(float num1,float num2) {
		System.out.println("DIVISION");
		System.out.println("4 Divided by 3");
		System.out.println(num1/num2+"\n");
		
	}
	void roots() {
		System.out.println("RAISED TO POWER");
		System.out.println(num1^num2);
		System.out.println("19 Divided by 2 has a remainder of 1\n");
	}
	void modulus() {
		System.out.println("MODULUS");
		System.out.println(num1%num2);
		System.out.println("19 Divided by 2 has a remainder of 1");
		
	}
	void display() {
		System.out.println("First number is: "+ num1);
		System.out.println("Second number is: "+ num2);
		System.out.println("Name is: "+ col+"\n");
		
	}
	void dup() {
		System.out.println("Name is: "+ col+"\n");
	}
	void addtwonumbers() {
		num3=num1+num2;
		System.out.println("Sum of number2 is: "+ num3+"\n");
	}
	//you can also call other methods in another method then call it in a main method
	void callingothermethods() {
		_class add= new _class();
		add.addition();

		_class minos= new _class();
		minos.minus();

		_class multi= new _class();
		multi.multiplication();
		
		_class div= new _class();
		div.division(3,7);
		
		_class root= new _class();
		root.roots();
	
		_class mod= new _class();
		mod.modulus();

		/* do for the remaining arithmetics operator */
	}
	public static void main(String[] args) {
		_class val= new _class();
		val.col="eniola2";//changed col
		val.display();
		
		_class rep= new _class();
		rep.display();//still takes the value of val.col
		
		_class van= new _class();
		van.dup();

		
		_class added= new _class();
		//added.addtwonumbers();
		
		_class call= new _class();
		call.callingothermethods();
		
	}
}

