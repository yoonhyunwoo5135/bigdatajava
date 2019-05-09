package bank;

public class BadBank extends Bank {
	double rate = 3.0;
	
	@Override
	public void interestRate() {
		System.out.println("나쁜 은행의 이자율: " + rate);
	}
	
}
