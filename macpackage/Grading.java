package macpackage;

public class Grading {
	
	public void grade(int score) {
		System.out.print("WHATS YOUR SCORE ? "+ score+ "\n");
		if (score>=100)
			System.out.println("BOSS YOU TOO GOOD ABEG!!");
		
		else if (score>=70)
		System.out.println("YOUR GRADE IS A1");
		
		else if (score>=65)
		System.out.println("YOUR GRADE IS B2");
		
		else if (score>=50)
		System.out.println("YOUR GRADE IS C5");
		
		else if (score>=30)
		System.out.println("YOUR GRADE IS D5");
		
		else
		System.out.println("YOUR GRADE IS F9");
		
	}

	public static void main(String[] args) {
		Grading call=new Grading();
		call.grade(125);
		

	}

}
