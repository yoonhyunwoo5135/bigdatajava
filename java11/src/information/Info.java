package information;

public class Info {
	String id;
	String pw;
	String grade;
	int mileage;
	
	
	public Info(String id, String pw, String grade, int mileage) {
		
		this.id = id;
		this.pw = pw;
		this.grade = grade;
		this.mileage = mileage;
	}

	public String toString() {
		return id + "\t" + pw + "\t" + grade + "\t" + mileage + "\t";
	}
	

	
	

}
