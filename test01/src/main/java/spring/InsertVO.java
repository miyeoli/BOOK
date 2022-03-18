package spring;

import org.springframework.web.multipart.MultipartFile;

public class InsertVO {
	
	private String isbn;
	private String name;
	private String writer;
	private String publisher;
	private String price;
	private MultipartFile image;
	private String content;
	private String filename;
	
	public InsertVO() {}


	public InsertVO(String isbn, String name,  String writer, String publisher, String price, MultipartFile image, String content) {
		this.isbn = isbn;
		this.name = name;
		this.writer = writer;
		this.publisher = publisher;
		this.price = price;
		this.image = image;
		this.content = content;
		
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

	public MultipartFile getImage() {
		return image;
	}

	public void setImage(MultipartFile image) {
		this.image = image;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}
	
	@Override
	public String toString() {
		return "InsertVO [isbn=" + isbn + ", name=" + name + ", writer=" + writer + ", publisher=" + publisher
				+ ", price=" + price + ", image=" + image + ", content=" + content + ", filename=" + filename + "]";
	}



	
	
	
}
