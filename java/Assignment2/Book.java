
public class Book {
	long ISBN;
	String name;
	double price;
	String publication;
	String author;
	

	public Book(){
		ISBN = 0;
		name = null;
		price = 0;
		publication = null;
		author = null;
	}
	
	public Book(long ISBN, String name, double price ){
		this.ISBN = ISBN;
		this.name = name;
		this.price = price;
	}
	
	public Book(long ISBN, String name, String publicaiton,String author ){
		this.ISBN = ISBN;
		this.name = name;
		this.publication = publicaiton;
		this.author = author;
	}
	
	public void display(){
		System.out.println("The ISBN of book is " + ISBN + " Name :"+name + "\n" +" Price :"+price+ " published by :"+ publication + "Written by: "+ author);
	}
	
	
	public long getISBN() {
		return ISBN;
	}


	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getPublication() {
		return publication;
	}


	public void setPublication(String publication) {
		this.publication = publication;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	
	

}
