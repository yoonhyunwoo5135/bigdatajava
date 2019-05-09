package bank;

public class GoodBank extends Bank {
	double rate = 10.0;	
	
	@Override
	public void interestRate() {
		System.out.println("좋은 은행의 이자율: " + rate);
	}
	
}
