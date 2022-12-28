class Publication
{
	String title;
	int copies, price;
	void saleCopy()
	{
	
	}
}

class Book extends Publication
{
	String title, author;
	int copies, price;
	Book(String n, String t, int c, int p)
	{
		this.author=n;
		this.title=t;
		this.copies=c;
		this.price=p;
	}
	void orderCopies()
	{
		System.out.println("\nordered book copies: \n"+this.copies);
	}
	void saleCopy()
	{
		int total=this.price*this.copies;
		System.out.println("\ntotal sale of books:  \n"+total);
	}
}

class Magazine extends Publication
{
	String title;
	int copies, price;
	Magazine(String t, int c, int p)
	{
		this.title=t;
		this.copies=c;
		this.price=p;
	}
	void orderCopies()
	{
	
	}
	void saleCopy()
	{
		
	}
	
}

public class Total
{
	public static void main(String args[])
	{
		Book b1= new Book("Chetan Bhagat","Half Girlfriend",5,240);
		b1.orderCopies();b1.saleCopy();
    }
} 


