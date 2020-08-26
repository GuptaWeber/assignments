
public interface BookStore {
	Book[] getBooks();
	
	Book findBookById(Book[] books, long ID);
	
	Book updateBook(Book[] books, long ID, double price);
	
	void displayBooks(Book[] books);
	
}
