package macpackage;

public class Elsif {
	
	public void checkevenwired(int n){
		if (n % 2 !=0) {
			System.out.println("wired");
		}else {
			if (n>=2 && n<=5) {
				System.out.println("not wired");
			}else {
				if (n >=6 && n<=20)
					System.out.println("wired");
				else {
					if (n > 20) {
						System.out.println("not wired");
					}
				}
			}
		}
	}
	public void elsifevenwired(int n){
		if (n % 2 !=0) 
			System.out.println("wired");
		else if (n>=2 && n<=5) 
			System.out.println("not wired");
		else if (n >=6 && n<=20)
			System.out.println("wired");
		else if (n > 20) 
			System.out.println("not wired");

	}
	public String hi (int n) {
		if (n% 2 == 0)
			return "even";
		return "";	
	}
	
	public static void main(String[] args) {
		Elsif call=new Elsif();
		call.checkevenwired(17);
		call.checkevenwired(15);
		call.checkevenwired(30);
		call.checkevenwired(90);
		call.checkevenwired(16);
		
		Elsif calo=new Elsif();
		calo.elsifevenwired(16);
		
		Elsif calli=new Elsif();
		call.checkevenwired(16);
		
		
		
	}

}
