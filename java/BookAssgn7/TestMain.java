import java.util.Scanner;

import com.exce.BookNotFoundException;
import com.interfaces.BookStoreImpl;
import com.pojo.Book;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0,ch;
		
		Scanner sc = new Scanner(System.in);
		BookStoreImpl bookStoreImpl = new BookStoreImpl();
		
		Book[] books = bookStoreImpl.getBooks();
		
		do{
			System.out.println("Select an Option to Continue: \n 1. Find a book by Id \n 2. Find a book by name\n "
					+ "3. Update Book\n 4.Display All books \n 0 to Terminate");
			
			ch = sc.nextInt();
			
			if(ch==1){
				
				System.out.println("Please Enter the Id that you want to search");
				Book book = bookStoreImpl.findBookById(books, sc.nextInt() );
				
				if(book.getName()!=null){
					book.display();
				}else{
					
					try {
						throw new BookNotFoundException("Book Not Found Exception");
					} catch (BookNotFoundException e) {
						// TODO Auto-generated catch block
						e.displayMessage();
					}
				}
				
				
			}else if(ch==2){
				
				System.out.println("Please Enter the name of the book that you want to search");
				Book book = bookStoreImpl.findBookByName(books, sc.next() );
				
				if(book.getName()!=null){
					book.display();
				}else{
					
					try {
						throw new BookNotFoundException("Book Not Found Exception");
					} catch (BookNotFoundException e) {
						// TODO Auto-generated catch block
						e.displayMessage();
					}
				}
				
			}else if(ch == 3){
				
				System.out.println("Please Enter the id of the book and also new price that you want to update");
				Book book = bookStoreImpl.updateBook(books, sc.nextInt(),sc.nextDouble() );
				
				if(book.getName()!=null){
					book.display();
				}else{
					
					try {
						throw new BookNotFoundException("Book Not Found Exception");
					} catch (BookNotFoundException e) {
						// TODO Auto-generated catch block
						e.displayMessage();
					}
				}

			}else if(ch == 4){
				bookStoreImpl.displayBooks(books);
			}else if(ch ==0 ){
				System.out.println("Terminated");
				break;
			}

		}while(i==0);

	}
}
