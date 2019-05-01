package control;

public class Day1 {
	
	static int sum = 0;
	static int time3 = 0;
	
	
	String work;
	int time;
	String local;
	
	public Day1(){
		
	}
	
	
	public Day1(String work, int time, String local) {
		this.work = work;
		this.time = time;
		this.local = local;
		time3++;
		sum = sum + time;
	}
	
	public String toString() {
		return  work + ", " + time + ", " + local;	
	}
	
	
	
	
	

}
