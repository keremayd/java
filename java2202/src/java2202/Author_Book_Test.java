package java2202;

import java.util.*;

public class Author_Book_Test {

	public static void main(String[] args) {
		Author author1 = new Author("Şevval", "Kadın", "sevval@gmail.com");
		Author author2 = new Author("Kerem", "Erkek", "kerem@gmail.com");
		Author author3 = new Author("Sefa", "Erkek", "sefa@gmail.com");
		Author author4 = new Author("Yusuf", "Erkek", "yusuf@gmail.com");
		Author author5 = new Author("Beyza", "Kadın", "beyza@gmail.com");
		Author[] a = {author1, author2, author5};
		
		Book book1 = new Book();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Title? ");
		String title = input.next();
		System.out.print("Price? ");
		double price = input.nextDouble();
		
		book1.setTitle(title);
		book1.setPrice(price);
		book1.setAuthor(a);

		System.out.println(book1.toString());
	}

}
