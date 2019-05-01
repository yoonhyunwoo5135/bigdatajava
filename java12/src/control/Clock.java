package control;

public class Clock {
	private int price;
	private String name;
	private int nowtime;
	private String company;

	public Clock(int price, String name, int nowtime, String company) {
		this.price = price;
		this.name = name;
		this.nowtime = nowtime;
		this.company = company;

	}

	public Clock(int price, int nowtime, String company) {

		this.price = price;
		this.nowtime = nowtime;
		this.company = company;

	}

	public Clock(int price, String company) {
		super();
		this.price = price;
		this.company = company;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public static void main(String[] args) {

		Clock c1 = new Clock(100000, "전자시계", 1530, "casio");
		Clock c2 = new Clock(700000, 1530, "Rolex");
		Clock c3 = new Clock(50000, "gshock");

		System.out.println(c1.getCompany() + "\t" + c1.getPrice());
		System.out.println(c2.getCompany() + "\t" + c2.getPrice());
		System.out.println(c3.getCompany() + "\t" + c3.getPrice());
	
	}

}
