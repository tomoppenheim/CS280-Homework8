import java.util.*;
import java.io.*;

public class Library {
    public static void main(String[] args) {
	
	ArrayList<Book> books = new ArrayList<Book>();
	Scanner keyboard = new Scanner(System.in);
	boolean addBooks = true;
	String bookTitle;
	String bookAuthor;
	
	while(addBooks == true){
		System.out.println("Please enter the Title of the book");
		bookTitle = keyboard.nextLine();
		System.out.println("Please enter the Author of the book");
		bookAuthor = keyboard.nextLine();
		}
    }
}