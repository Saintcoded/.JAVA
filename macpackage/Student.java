package macpackage;

public class Student {
	String firstname="eniola",lastname="ridwan",course="java";
	int age=15;
	
	public Student(String fname,String lname,String course,int age ){
		firstname =fname;
		lastname=lname;
		course=this.course;
		age=this.age;
	}
	public void display() {
		System.out.println("my firstname is "+firstname+" lastname is "+ lastname +" i am "+ age +" yrs old "+" i study "+course+"\n");
	}

		
	
	

	public static void main(String[] args) {
		
		Student call=new Student("dammy","mac","mathematics",20);
		System.out.println(call.getClass());
		System.out.println(call.getClass().getName());
		System.out.println(call.getClass().getSimpleName());
		
//		call.display();
		
		

	}

}
