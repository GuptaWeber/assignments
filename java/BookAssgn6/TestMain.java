
public class TestMain implements BookStore {

	@Override
	public Book[] getBooks() {
		
		Book[] books = new Book[5];
		
		books[0] = new Book(112233, "Reactive Programming With Java 9", "PACKT", "Tejaswini Mandar Jog" );
		books[1] = new Book(123455, "Learning Modular Java Programming", "PACKT", "Tejaswini Mandar Jog" );
		books[2] = new Book(122334, "Learning Spring 5.0", "PACKT", "Tejaswini Mandar Jog" );
		books[3] = new Book(123345, "OCP Java SE 8: Programmer", "McGraw-Hill", "Kathy Sierra" );
		books[4] = new Book(778901, "OCP Java SE 8 Programmer II Exam Guide", "McGraw-Hill", "Kathy Sierra" );
		
		return books;
	}

	@Override
	public Book findBookById(Book[] books, long ID) {
		for(Book book : books){
			
			if(book.getISBN() == ID){
				return book;
			}
		}
		return new Book();
	}

	@Override
	public Book updateBook(Book[] books, long ID, double price) {
		
		Book book = findBookById(books,ID);
		
		if(book.getName()!=null){
			
			book.setPrice(price);
			
			return book;
		}
		
		return new Book();
	}

	@Override
	public void displayBooks(Book[] books) {

		for(Book book : books){
			System.out.println("The ISBN of the Book is "+ book.getISBN() +" The Name of the Book is "+book.getName() + " \n"
			+ " Price is " + book.getPrice() + " Written by " + book.getAuthor() + " Published By "+ book.getPublication()
					);
			System.out.println("--------------------------------- --------------- -----------------------------");
		}

	}
	
	
	public static void main(String[] args){
		TestMain testMain = new TestMain();
		
		Book[] books = testMain.getBooks();
		
		testMain.displayBooks(books);
		
		testMain.findBookById(books, 123455).display();
		testMain.updateBook(books, 778901,2399).display();
		
		
	}

}
