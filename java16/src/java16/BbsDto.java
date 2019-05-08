package java16;

public class BbsDto {
	private String id;
	private String title;
	private String content;
	private String etc;
	
	public BbsDto() {
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getEtc() {
		return etc;
	}
	public void setEtc(String etc) {
		this.etc = etc;
	}
	public BbsDto(String id, String title, String content, String etc) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.etc = etc;
	}
	@Override
	public String toString() {
		return "BbsDto [id=" + id + ", title=" + title + ", content=" + content + ", etc=" + etc + "]";
	}	
	
}
