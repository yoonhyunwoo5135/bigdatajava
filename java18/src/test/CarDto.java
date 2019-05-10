package test;

public class CarDto {
	private String id;
	private String name;
	private String content;
	private String price;

	public CarDto() {

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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", content=" + content + ", price=" + price + "]";
	}
	
	
}
