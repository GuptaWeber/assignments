
public class HandleBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookStore bookStore = new BookStore();
		
		Book [] books = bookStore.getBooks();
		
		for(Book book : books){
			book.display();
			System.out.println("--------------------------------------------");
		}
		
		Book findBook = bookStore.findBookById(books,123455);
		
		if(findBook.name!=null){
			System.out.println("The name of the book is "+ findBook.name);
		}else{
			System.out.println("Book Not Found");
		}
		
		Book updatePrice = bookStore.updateBook(books, 123455, 2999);
		if(updatePrice.name!=null){
			System.out.println("The name of the book is "+ updatePrice.name + " New Price is "+ updatePrice.price);
		}else{
			System.out.println("Book Not Found");
		}
		
		
		

	}

}
