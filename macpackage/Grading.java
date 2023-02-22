package macpackage;

public class Grading {
	
	public void grade(int score) {
		String grade;
		System.out.print("WHATS YOUR SCORE ? "+ score+ "\n");
		if (score>=100)
			grade="BOSS";
		
		else if (score>=70)
		grade="A1";
		
		else if (score>=65)
			grade="B2";
		
		else if (score>=50)
			grade="C5";
		
		else if (score>=30)
			grade="D4";
		
		else
			grade="F9";
		
		System.out.println("YOUR GRADE IS "+ grade );
	}

	public static void main(String[] args) {
		Grading call=new Grading();
		call.grade(125);
		

	}

}
