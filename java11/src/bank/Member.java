package bank;

public class Member {
	String product;
	String name;
	int money;
	
	public Member(String product, String name, int money) {
		this.product = product;
		this.name = name;
		this.money = money;
	}
	
	public String toString() {
		return product + "\t" + name + "\t" + money;
	}

}
