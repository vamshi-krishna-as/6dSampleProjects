package com.sixdee.bookstore;

import java.util.Scanner;

public class BookShop
{
	public static void main(String[] args) 
	{
		int ch = 0;
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		try 
		{
			while (true) 
			{
				System.out.println("Choose 1 to Add a new book into the Store.");
				System.out.println("Choose 2 to View the Current books stock in the Store.");
				System.out.println("Choose 3 to View all the Books in the Store.");
				System.out.println("Choose 4 to View Book details according to thier Author Name.");
				System.out.println("Choose 5 to View Book details according to Genre.");
				System.out.println("Choose 6 to Sell the Books");
				System.out.println("Choose 7 to Exit!!");
				System.out.println("Enter your choice");
				
				try {
					ch = sc1.nextInt();
				}
				catch(Exception e) {
					e.printStackTrace();
					System.out.println("");
					main(args);
				}
				
				switch(ch)
				{
					case 1:
						System.out.println("Enter the Book Name : ");
						String bName = sc2.nextLine();
						System.out.println("Enter the Author Name : ");
						String aName = sc2.nextLine();
						System.out.println("Enter the Book Genre : ");
						String bGenre = sc2.nextLine();
						System.out.println("Enter the Book Price : ");
						double bPrice = sc1.nextDouble();
						BookOperations.addBook(bName, aName, bGenre, bPrice);
						System.out.println();
						break;
					
					case 2:
						System.out.println("The Total number of Books in the store is : "+BookOperations.getCount()+"\n");
						System.out.println("Enter book name to view stock is present or not. \n");
						String str = sc1.next();
						System.out.println("\nThe Total number of "+str+" Books in the store is : "+BookOperations.getBookCount(str)+"\n");
						break;
					
					case 3:
						BookOperations.viewBooks();
						break;
					
					case 4:
						System.out.println("Enter the Author name to retrieve the books : \n");
						String s = sc1.next();
						BookOperations.getBooksAccToAuthour(s);
						break;
					
					case 5:
						System.out.println("Enter the Genre to retrieve the books : \n");
						String s1 = sc1.next();
						BookOperations.getBooksAccToGenre(s1);
						break;
					
					case 6:
						for(Book ele : BookOperations.getBookList()) 
						{
							System.out.println("(*) "+ele.getBookName()+"\n");
						}
						System.out.println("Select the book to sell : ");
						String str1 = sc1.next();
						BookOperations.sellBook(str1);
						break;
					
					case 7:
						System.exit(0);
						break;
					
					default : throw new IllegalArgumentException("Invalid types for choices..");
					
				}
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("");
			main(args);
		}
	}
}
