package control;

public class Person {
	
	private int height;
	private int weight;
	private String secret;
	private String address;
	
	public Person(int height , int weight,  String secret, String address) {
		
	}
	
	public Person(int height , int weight,  String secret) {
		
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}
	
	public double goodWeight() {
		return (height-100) * 0.9;
		
	}
	

}
