package shoppingmall;

public class Member {

	String name;
	int age;
	String phone;
	String adress;
	
	public Member(String name, int age, String phone, String adress) {
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.adress = adress;
	}
	
	@Override
	public String toString() {
		return name + "\t" + age + "\t" + phone + "\t" + adress;
	}
	
}
