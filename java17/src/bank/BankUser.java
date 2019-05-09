package bank;

public class BankUser {

	public static void main(String[] args) {
		GoodBank g = new GoodBank();
		NormalBank n = new NormalBank();
		BadBank b = new BadBank();
		
		g.interestRate();
		n.interestRate();
		b.interestRate();
		
		
	}
	
}
