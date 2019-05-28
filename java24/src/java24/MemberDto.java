package java24;

public class MemberDto {
	private String id;
	private String name;
	private String tel;
	private String pw;
	
	public MemberDto(String string, String string2, String string3, String string4) {
		
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "MemberDto [id=" + id + ", name=" + name + ", tel=" + tel + ", pw=" + pw + ", getPw()=" + getPw()
				+ ", getId()=" + getId() + ", getName()=" + getName() + ", getTel()=" + getTel() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
