package com.itbank.mvc06;

//DTO(Data Transfer Object)=VO(Value Object)
public class BbsDTO {
	private String id;
	private String title;
	private String content;
	private String writer;
	private String selectId;
	
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
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getSelectId() {
		return selectId;
	}
	public void setSelectId(String selectId) {
		this.selectId = selectId;
	}
	
	
	
}
