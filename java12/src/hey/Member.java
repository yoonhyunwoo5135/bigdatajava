package hey;

public class Member {
	
	static int agesum = 0;
	static int membercount = 0;
	
	
	
	String name;
	String jender;
	int age;
	
	public Member(){
	}
	
	public Member(String name, String jender, int age) {
		this.name = name;
		this.jender = jender;
		this.age = age;
		membercount++;
		agesum = agesum + age;
	}
	
	public String work() {
		return "일하다";
	}
	
	public String friendly() {
		return "친화력이 있다";
	}
	
}
