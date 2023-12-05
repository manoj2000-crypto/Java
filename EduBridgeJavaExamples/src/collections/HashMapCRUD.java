package collections;

import java.util.*;

public class HashMapCRUD {

	void crud() 
	{
		HashMap<Integer, Book> bookMap = new HashMap<Integer, Book>();
		
		//Create Book
		Book b1 = new Book(101, "Let us C", "Yashwant kanetkar");
		Book b2 = new Book(102, "Data communications & Networking", "Forouzan");
		Book b3 = new Book(103, "Operating System", "Galvin");
		
		//Add Book
		bookMap.put(b1.getId(), b1);
		bookMap.put(b2.getId(), b2);
		bookMap.put(b3.getId(), b3);
		
		//Read Books
		Book read1 = bookMap.get(101);
		Book read2 = bookMap.get(102);
		Book read3 = bookMap.get(103);
		
		//display
		System.out.println("********* Book List *********");
		System.out.println(read1);
		System.out.println(read2);
		System.out.println(read3);
		
		//Update Book
		if(read1 != null)
		{
			read1.setTitle("Temp Title");
			bookMap.put(read1.getId(), read1);
			System.out.println("\n**** Updated the book  ***");
			System.out.println("Updated Book : " + read1);
			System.out.println("--------------------------");
		}
		
		//delete
		bookMap.remove(102);
		System.out.println("Book with id 102 has been deleted.");
		System.out.println("Revised book list after deletion");
		System.out.println("----------------------------------");
		
		for(Book book : bookMap.values()) 
		{
			System.out.println(book);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		HashMapCRUD hmcrud = new HashMapCRUD();
		
		hmcrud.crud();
		
	}

}
