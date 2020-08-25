
public class BookStore {
	
	Book[] getBooks(){
		
		Book[] books = new Book[5];
		
		books[0] = new Book(112233, "Reactive Programming With Java 9", "PACKT", "Tejaswini Mandar Jog" );
		books[1] = new Book(123455, "Learning Modular Java Programming", "PACKT", "Tejaswini Mandar Jog" );
		books[2] = new Book(122334, "Learning Spring 5.0", "PACKT", "Tejaswini Mandar Jog" );
		books[3] = new Book(123345, "OCP Java SE 8: Programmer", "PACKT", "Tejaswini Mandar Jog" );
		books[4] = new Book(778901, "Reactive Programming With Java 9", "PACKT", "Tejaswini Mandar Jog" );
		
		return books;
	}
	
	
	Book findBookById(Book[] books, long ID){
		
		for(Book book : books){
			
			if(book.getISBN() == ID){
				return book;
			}
		}
		return new Book();
		
	}
	
	Book updateBook(Book[] books, long ID, double price){
		
		for(Book book : books){
			
			if(book.getISBN() == ID){
				
				book.setPrice(price);
				
				return book;
			}
		}
		
		return new Book();
	}
}

