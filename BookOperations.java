package com.sixdee.bookstore;

import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;

public class BookOperations
{
	private static int count = 0; 
	private static int bookCount;
	private static List<Book> bookList = new ArrayList<Book>();

	public static int getCount() 
	{
		return count;
	}

	public static int getBookCount() 
	{
		return bookCount;
	}

	public static List<Book> getBookList() 
	{
		return bookList;
	}

	//logic to add books into the list
	public static void addBook(String bookName, String authorName, String bookGenre, double bookPrice) 
	{
		Book b1 = new Book(bookName.toLowerCase(), authorName.toLowerCase(), bookGenre.toLowerCase(), bookPrice);
		bookList.add(b1);
		++count;
	}
	
	//logic to get the book count in the store
	public static int getBookCount(String bName)
	{
		bookCount = 0;
		for(Book ele : bookList) 
		{
			if(ele.getBookName().contains(bName.toLowerCase()))
			{
				++bookCount;
			}
		}
		return bookCount;
	}

	//logic to view all the books in the store
	public static void viewBooks() 
	{
		if(!bookList.isEmpty())
		{
			System.out.println("Current Books available in the store are : \n");
			for(Book ele : bookList) 
			{
				System.out.println(ele);
				System.out.println("------------------------------------------\n");
			}
		}
		else
		{
			System.out.println("Book Store is Empty!!! . please try to add the books\n");
		}
	}
	
	//logic to get books according to their author
	public static void getBooksAccToAuthour(String str) 
	{
		System.out.println("The Books by the Author "+str+" are : ");
		for(Book ele : bookList) 
		{
			if(ele.getAuthorName().contains(str.toLowerCase()))
			{
				System.out.println(ele);
				System.out.println("------------------------------------------\n");
			}
		}
	}
	
	//logic to get books according to genre
	public static void getBooksAccToGenre(String str1)
	{
		System.out.println("The Books by the Genre "+str1+" are : ");
		for(Book ele1 : bookList) 
		{
			if(ele1.getBookGenre().contains(str1.toLowerCase()))
			{
				System.out.println(ele1);
				System.out.println("------------------------------------------\n");
			}
		}
	}
	
	//logic to remove the books from the list
	public static void sellBook(String bName) 
	{
		java.util.Iterator<Book> it =  bookList.iterator();
		while(it.hasNext()) 
		{
			if(it.next().getBookName().equals(bName.toLowerCase()))
			{
				it.remove();
			}
		}
		System.out.println("The book "+bName+" has been successfully sold..");
		viewBooks();
	}	
}
