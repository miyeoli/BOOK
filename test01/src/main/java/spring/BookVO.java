package spring;


public class BookVO {
	private Long num;
	private String isbn;
	private String name;
	private String writer;
	private String publisher;
	private String price;
	private String image;
	private String content;
	
	public BookVO() {}
	
	public BookVO(String isbn, String name, String writer, String publisher, String price, String image, String content) {
		this.isbn = isbn;
		this.name = name;
		this.writer = writer;
		this.publisher = publisher;
		this.price = price;
		this.image = image;
		this.content = content;
	}


	public Long getNum() {
		return num;
	}

	public void setNum(Long num) {
		this.num = num;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}


	@Override
	public String toString() {
		return "BookVO [num=" + num + ", isbn=" + isbn + ", name=" + name + ", writer=" + writer + ", publisher="
				+ publisher + ", price=" + price + ", image=" + image + ", content=" + content + "]";
	}
	
	
	

}
