package java2202;

public class Book {
	private String title;
	private double price;
	private Author[] author;
	
	public Book() {}
	public Book(String title, double price, Author[] author) {
		this.title = title;
		this.price = price;
		this.author = author;
	
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public Author[] getAuthor() {
		return author;
	}
	public void setAuthor(Author[] author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		System.out.println("Number of Authors: " + author.length);
		System.out.println("Authors: ");
		for(int i = 0; i<author.length; i++) {
			System.out.println(author[i]);
		}
		return "Title: "+title+ " Price: "+price;
		
	}
}
