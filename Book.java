package com.sixdee.bookstore;

public class Book 
{

	private String bookName;
	private String authorName;
	private String bookGenre;
	private double bookPrice;

	public String getBookName() 
	{
		return bookName;
	}

	public void setBookName(String bookName) 
	{
		if (bookName != null && !bookName.trim().equals(""))
		{
			this.bookName = bookName;
		}
		else
		{
			throw new IllegalArgumentException(
					"Illegal values for Book Name!!, Book Name should not be null or cannot be empty!!");
		}
	}

	public String getAuthorName() 
	{
		return authorName;
	}

	public void setAuthorName(String authorName) 
	{
		if (authorName != null && !authorName.trim().equals(""))
		{
			this.authorName = authorName;
		}
		else
		{
			throw new IllegalArgumentException(
					"Illegal values for Author Name!!, Author Name should not be null or cannot be empty!!");
		}
	}

	public String getBookGenre() 
	{
		return bookGenre;
	}

	public void setBookGenre(String bookGenre) 
	{
		if (bookGenre != null && !bookGenre.trim().equals(""))
		{
			this.bookGenre = bookGenre;
		}
		else
		{
			throw new IllegalArgumentException(
					"Illegal values for Book Genre!!, Book Genre should not be null or cannot be empty!!");
		}

	}

	public double getBookPrice() 
	{
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) 
	{
		if (bookPrice > 0.0)
		{
			this.bookPrice = bookPrice;
		}
		else
		{
			throw new IllegalArgumentException("Illegal values for Book Price!!, Book Price cannot be Negetive!!");
		}
	}

	public Book(String bookName, String authorName, String bookGenre, double bookPrice) 
	{
		super();
		if (bookName != null && !bookName.trim().equals(""))
		{
			this.bookName = bookName;
		}
		else 
		{
			throw new IllegalArgumentException(
					"Illegal values for Book Name!!, Book Name should not be null or cannot be empty!!");
		}

		if (authorName != null && !authorName.trim().equals(""))
		{
			this.authorName = authorName;
		}
		else
		{
			throw new IllegalArgumentException(
					"Illegal values for Author Name!!, Author Name should not be null or cannot be empty!!");
		}

		if (bookGenre != null && !bookGenre.trim().equals(""))
		{
			this.bookGenre = bookGenre;
		}
		else
		{
			throw new IllegalArgumentException(
					"Illegal values for Book Genre!!, Book Genre should not be null or cannot be empty!!");
		}

		if (bookPrice > 0.0)
		{
			this.bookPrice = bookPrice;
		}
		else
		{
			throw new IllegalArgumentException("Illegal values for Book Price!!, Book Price cannot be Negetive!!");
		}
	}

	public Book() 
	{
		super();
	}

	@Override
	public String toString() 
	{
		return "BookName : "+bookName+"\nAuthorName :"+authorName+"\nGenre : "+bookGenre+"\nBookPrice : "+bookPrice;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if(obj instanceof Book)
		{
			Book b = (Book)obj;
			if(this.bookName.equals(b.bookName) && this.authorName.equals(b.authorName) && this.bookGenre.equals(b.bookGenre) && this.bookPrice == b.bookPrice)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		return false;
	}	
}
