package bank;

public class NormalBank extends Bank {
	double rate = 5.0;	
	
	@Override
	public void interestRate() {
		System.out.println("����� ������ ������: " + rate);
	}
}
