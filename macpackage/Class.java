package macpackage;

public class Class {
    int num1=5;
   int num2=7;
   static int num3; //it changes it for all num3
   static int num4 = 5;
   public void evolv() {//it can be seen in other classes

   }
   public static void dataTypes(){//method static makes it possible to run with out creating an object and public makes it run in another package
       num3=67;
       System.out.println("the minimum integer value is: "+Integer.MIN_VALUE);
       System.out.println("the SIZE of integer value is: "+Integer.SIZE);
       System.out.println("the maximum float value is: "+ Float.MAX_VALUE);
       System.out.println("the minimum float value is: "+ Float.MIN_VALUE);
       System.out.println("the SIZE of float value is: "+ Float.SIZE);
       System.out.println("the maximum Short value is: "+ Short.MAX_VALUE);
       System.out.println("the minimum Short value is: "+ Short.MIN_VALUE);
       System.out.println("the SIZE of Short value is: "+ Short.SIZE);
       System.out.println("the maximum Long value is: "+ Long.MAX_VALUE);
       System.out.println("the minimum Long value is: "+ Long.MIN_VALUE);
       System.out.println("the SIZE of Long value is: "+ Long.SIZE);
       System.out.println("the maximum Double value is: "+ Double.MAX_VALUE);
       System.out.println("the minimum Double value is: "+ Double.MIN_VALUE);
       System.out.println("the SIZE of Double value is: "+ Double.SIZE);
       System.out.println("the maximum Byte value is: "+ Byte.MAX_VALUE);
       System.out.println("the minimum Byte value is: "+ Byte.MIN_VALUE);
       System.out.println("the SIZE of Byte value is: "+ Byte.SIZE);


   }
    public void Example(){
       System.out.println(num4+num2);
   }


	public static void main(String[] args) {//method is used to call the programs
		Class.dataTypes();
//      Primitive & non-primitive
//      Primitive
// 	    object: string- array-custom object
//      int,long,boolean,byte,float,double,char
//      Wrapper classes-
//      Integer,String,long,Byte,Boolean,Float,Double,Character
//      floats are treated as double so you have to specify by putting f at the end

/*        System.out.println ("Hello World!");

        byte byte_num2=127;
        int int_num=128;
        byte byte_num=(byte)int_num;
        short short_num=6000;
        long long_num=1000000000;
        float float_num=20.89f;
        double Double_num=20.89;
        System.out.println("int_num is: "+ int_num);
        System.out.println("byte_num is: "+ byte_num);
        System.out.println("short_num is: "+ short_num);
        System.out.println("long_num is: "+ long_num);
        System.out.println("long_num is: "+ float_num);
        System.out.println("long_num is: "+ Double_num);
        */
/*
        System.out.println("the maximum integer value is: "+Integer.MAX_VALUE);
        System.out.println("the minimum integer value is: "+Integer.MIN_VALUE);
        System.out.println("the SIZE of integer value is: "+Integer.SIZE);
        System.out.println("the maximum float value is: "+ Float.MAX_VALUE);
        System.out.println("the minimum float value is: "+ Float.MIN_VALUE);
        System.out.println("the SIZE of float value is: "+ Float.SIZE);
        System.out.println("the maximum Short value is: "+ Short.MAX_VALUE);
        System.out.println("the minimum Short value is: "+ Short.MIN_VALUE);
        System.out.println("the SIZE of Short value is: "+ Short.SIZE);
        System.out.println("the maximum Long value is: "+ Long.MAX_VALUE);
        System.out.println("the minimum Long value is: "+ Long.MIN_VALUE);
        System.out.println("the SIZE of Long value is: "+ Long.SIZE);
        System.out.println("the maximum Double value is: "+ Double.MAX_VALUE);
        System.out.println("the minimum Double value is: "+ Double.MIN_VALUE);
        System.out.println("the SIZE of Double value is: "+ Double.SIZE);
        System.out.println("the maximum Byte value is: "+ Byte.MAX_VALUE);
        System.out.println("the minimum Byte value is: "+ Byte.MIN_VALUE);
        System.out.println("the SIZE of Byte value is: "+ Byte.SIZE);
//      `  assignment
//Find the minimum and maximum values of all the data types
// the maximum integer value is: 2147483647
//the minimum integer value is: -2147483648
//the maximum float value is: 3.4028235E38
//the minimum float value is: 1.4E-45
//the maximum Short value is: 32767
//the minimum Short value is: -32768
//the maximum Long value is: 9223372036854775807
//the minimum Long value is: -9223372036854775808
//the maximum Double value is: 1.7976931348623157E308//the minimum Double value is: 4.9E-324
//the maximum Byte value is: 127
//the minimum Byte value is: -128*/
        System.out.println("Hello World");
        int snake_casing;
        int PascalCasing;
        int camelCasing;

        Class mac=new Class();
//        System.out.println(mac.num1);
//        System.out.println(mac.num1+76);
//        mac.dataTypes();
        System.out.println(mac.num4);
        mac.num4=3;
        mac.num2=9;
        mac.Example();

        Class mac2 =new Class();
        mac2.num2=4;
        mac2.num4=15;
        mac.Example();
        mac2.Example();

		Line you=new Line();//naming 
		you.training();//calling
    }
}
class Line{
	int numt=3; 
	int numm=8;
	int sum;
	
	public void training(){//being called
		sum=numt+numm;
		System.out.print("The Answer is= ");
		System.out.print(sum);
		
	}
}
