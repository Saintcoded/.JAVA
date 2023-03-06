package macpackage;

public class Loops {
	
	void greetreturn() {
		System.out.println("Start - greetReturn");
		for (int i =3; i <= 7;i++) {
			if (i==5) {
				return;
			}else if (i % 4 ==0) {
				System.out.println("all 4's");
			}else {
				System.out.println(i);
			}
			System.out.println("here at "+i);
		}System.out.println("END");
	}
	
	void greetBreak() {
		System.out.println("Start - greetBreak");
		for (int i =3; i <= 7;i++) {
			if (i==5) {
				break;
			}else if (i % 4 ==0) {
				System.out.println("all 4's");
			}else {
				System.out.println(i);
			}
			System.out.println("here at "+i);
		}System.out.println("END");
	}
	
	void greetcontinue() {
		System.out.println("Start - greetcontinue");
		for (int i =3; i <= 7;i++) {
			if (i==5) {
				continue;
			}else if (i % 4 ==0) {
				System.out.println("all 4's");
			}else {
				System.out.println(i);
			}
			System.out.println("here at "+i);
		}System.out.println("END");	}
	
	void greecontinue() {
		System.out.println("Start - greetcontinue");
		for (int i =3; i <= 7;i++) {
			if (i==5) {
				continue;
			}else if (i % 4 ==0) {
				System.out.println("all 4's");
			}else {
				System.out.println(i);
			}
			System.out.println("here at "+i);
		}System.out.println("END");
	}

	public static void main(String[] args) {
		Loops call=new Loops();
		call.greetreturn();
		call.greetcontinue();
		call.greetBreak();
		
		
	}
}
