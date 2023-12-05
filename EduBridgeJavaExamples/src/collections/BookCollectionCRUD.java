//package collections;
//
//import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.List;
//
//public class BookCollectionCRUD {
//	
//	List<Book> bookCollection = new ArrayList<Book>();
//	
//	Scanner sc = new Scanner(System.in);
//	
//	int bId;
//	String bTitle;
//	String bAuthor;
//	
//	//Accept data from user at runtime;
//	void accept() 
//	{
//	    char again = ' ';
//	    
//	    do 
//	    {
//	        System.out.print("\nEnter Book Id : ");
//	        bId = Integer.parseInt(sc.nextLine());
//	        
//	        System.out.print("Enter Book Title : ");
//	        bTitle = sc.nextLine();
//	        
//	        System.out.print("Enter Book Author : ");
//	        bAuthor = sc.nextLine();
//	        
//	        //Read
//	        for(Book book : bookCollection) 
//	        {
//	            System.out.println(book.toString());
//	        }
//	        
//	        System.out.print("Do you want to add more type (y) : ");
//	        again = sc.nextLine().charAt(0);
//	    } while(again == 'y' || again == 'Y');
//	}
//	
//	void create() 
//	{
//		Book book1 = new Book(bId, bTitle, bAuthor);
//		Book book2 = new Book(bId, bTitle, bAuthor);
//		
//		bookCollection.add(book1);
//		bookCollection.add(book2);
//		
//		//Read
//		for(Book book : bookCollection) 
//		{
//			System.out.println(book);
//		}
//	}
//	
//	void update() 
//	{
//		//update 
//		int bookToUpdateIndex = 0;
//		
//		if(bookToUpdateIndex >= 0 && bookToUpdateIndex < bookCollection.size()) 
//		{
//			Book updateBook = bookCollection.get(bookToUpdateIndex);
//			updateBook.setTitle("Updated Book Title");
//			System.out.println("Book at index " + bookToUpdateIndex + " updated.");
//		}
//		else 
//		{
//			System.out.println("Invalid index for updaing.");
//		}
//		//Read after update
//		System.out.println("\nList of book after update : ");
//		
//		for(Book book : bookCollection) 
//		{
//			System.out.println(book);
//		}
//		
//	}
//	
//	//Delete
//	void delete() 
//	{
//		int bookToDeleteIndex = 1;
//		
//		if(bookToDeleteIndex >= 0 && bookToDeleteIndex < bookCollection.size()) 
//		{
//			bookCollection.remove(bookToDeleteIndex);
//			System.out.println("\nBook at index : " + bookToDeleteIndex + " delete.");
//		}
//		else 
//		{
//			System.out.println("nvalid index for deletion");
//		}
//		
//		//Read after delete
//		System.out.println("\nList of books after deletion : ");
//		for(Book book : bookCollection)
//		{
//			System.out.println(book);
//		}
//	}
//	
//
//	public static void main(String[] args) {
//		
//		BookCollectionCRUD b1 = new BookCollectionCRUD();
//		
//		b1.accept();
//		b1.create();
//		b1.update();
//		b1.delete();
//		
//	}
//
//}


package collections;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class BookCollectionCRUD {

    List<Book> bookCollection = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    // Accept data from the user at runtime
    void accept() {
        char again;
        do {
        	System.out.print("\n*** ACCEPT ***");
            System.out.print("\nEnter Book Id : ");
            int bId = Integer.parseInt(sc.nextLine());

            System.out.print("Enter Book Title : ");
            String bTitle = sc.nextLine();

            System.out.print("Enter Book Author : ");
            String bAuthor = sc.nextLine();

            Book newBook = new Book(bId, bTitle, bAuthor);
            bookCollection.add(newBook);

            System.out.print("Do you want to add more? (y/n) : ");
            again = sc.nextLine().charAt(0);
        } while (again == 'y' || again == 'Y');
    }

    void update() {
    	System.out.print("\n*** UPDATE ***");
        System.out.print("\nEnter the index of the book you want to update: ");
        int bookToUpdateIndex = Integer.parseInt(sc.nextLine());

        if (bookToUpdateIndex >= 0 && bookToUpdateIndex < bookCollection.size()) {
            System.out.print("Enter updated Book Title: ");
            String updatedTitle = sc.nextLine();

            Book updateBook = bookCollection.get(bookToUpdateIndex);
            updateBook.setTitle(updatedTitle);
            System.out.println("Book at index " + bookToUpdateIndex + " updated.");
        } else {
            System.out.println("Invalid index for updating.");
        }

        System.out.println("\nList of books after update: ");
        for (Book book : bookCollection) {
            System.out.println(book);
        }
    }

    void delete() {
    	System.out.print("\n*** DELETE ***");
        System.out.print("\nEnter the index of the book you want to delete: ");
        int bookToDeleteIndex = Integer.parseInt(sc.nextLine());

        if (bookToDeleteIndex >= 0 && bookToDeleteIndex < bookCollection.size()) {
            bookCollection.remove(bookToDeleteIndex);
            System.out.println("Book at index " + bookToDeleteIndex + " deleted.");
        } else {
            System.out.println("Invalid index for deletion.");
        }

        System.out.println("\nList of books after deletion: ");
        for (Book book : bookCollection) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        BookCollectionCRUD b1 = new BookCollectionCRUD();

        b1.accept(); // Accept new books
        b1.update(); // Update a book
        b1.delete(); // Delete a book
    }
}