package com.interfaces;
import java.util.Scanner;

import com.exce.BookNotFoundException;
import com.pojo.Book;

public class BookStoreImpl implements BookStore {

	@Override
	public Book[] getBooks() {
		// TODO Auto-generated method stub
		
		Book[] books = new Book[2];

		Scanner sc = new Scanner(System.in);
		
		for(int i =0; i<books.length; i++){

			System.out.println("Please Enter the Id of the book,  Name of the Book, Publisher and Author");
			
			books[i] = new Book(sc.nextInt(), sc.next(), sc.next(), sc.next()); 
		
		}
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
	public Book findBookByName(Book[] books, String name) {
		for(Book book : books){
			
			if(name.equals(book.getName())){
				return book;
			}
		}
		return new Book();
	}

	@Override
	public Book updateBook(Book[] books, long ID, double price) {
		// TODO Auto-generated method stub
		Book book = findBookById(books,ID);
		
		if(book.getName()!=null){
			
			book.setPrice(price);
			
			return book;
		}
		
		return new Book();
	}

	@Override
	public void displayBooks(Book[] books) {
		// TODO Auto-generated method stub
		for(Book book : books){
			System.out.println("The ISBN of the Book is "+ book.getISBN() +" The Name of the Book is "+book.getName() + " \n"
			+ " Price is " + book.getPrice() + " Written by " + book.getAuthor() + " Published By "+ book.getPublication()
					);
			System.out.println("--------------------------------- --------------- -----------------------------");
		}
	}



}
