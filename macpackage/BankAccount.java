package macpackage;

public class BankAccount {
	int My_Balance=0;
	int Charges=3;
	
	public BankAccount(int MyBalance) {
		
		if (MyBalance<=0) {
			System.err.println("INVALID INPUT CANNOT DEPOSIT "+"#"+MyBalance+"\n");
		}else{
			My_Balance=MyBalance;
			System.out.println("YOUR CURRENT BALANCE IS "+"#"+My_Balance+"\n");
		}
	}
	void CreditAmount(int Credit) {
		System.out.println("HOW MUCH DO YOU WANT TO DEPOSIT? "+"#"+Credit);
		if (Credit <=0 ) {
			System.err.println("ACCOUNT CANNOT BE CREDITED "+"#"+Credit+"\n");
		}else
			My_Balance=Credit+My_Balance-Charges;
		System.out.println("YOUR ACCOUNT HAS BEEN CREDITED "+"#"+Credit+" MY BALANCE: "+My_Balance+"\n");
	}
	
	void DebitAmount(int debit) {
		System.out.print("HOW MUCH DO YOU WANT? "+"#");
		System.out.println(debit);
		if (debit <=0 || debit>My_Balance) {
			System.err.println("#"+debit+" ACCOUNT CANNOT BE DEBITED FROM YOUR ACCOUNT INPUT ACCEPTED DIGITS."+"\n");
		}else {
			My_Balance=My_Balance-debit-Charges;
			System.out.println("YOUR ACCOUNT HAS BEEN DEBITED "+"#"+debit+" MY BALANCE: "+My_Balance+"\n");
		}
	}
	
	void GetBalance(String call) {
		
		System.out.println("DO YOU WANT TO SEE YOUR BALANCE ? "+call);
		
		if (call=="yes") {
			System.out.println("YOUR CURRENT BALANCE IS: "+"#"+My_Balance);
		}else if (call=="no") {
			System.out.println("THANK YOU FOR BANKING WITH US.");
		}else 
			System.err.println("INVALID INPUT"+"\n");//syser to print as error
	}
	
	public int GetBalances() {
		System.out.print("MY CURRENT BALANCE IS: ");
		return My_Balance;	//if using return u have to call it in a syout
	}
	
	
	
	public static void main(String[] args) {
		BankAccount call=new BankAccount(1000);
		call.CreditAmount(0);
		call.DebitAmount(500);
		call.GetBalance("yis");
		System.out.println("#"+call.GetBalances()); //calling a return method
	}

}
