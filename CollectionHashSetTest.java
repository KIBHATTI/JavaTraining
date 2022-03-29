import java.util.HashSet;
import java.util.Iterator;



public class CollectionHashSetTest {

	public static void main(String[] args)
	{
		HashSet<Book> hsObj = new HashSet<Book>();
		
		Book bookObj = new Book("97-8-12121","Lone Wolf","Neha Diwedi",500,1,500f);
		Book bookObj1 = new Book("87-5-127521","Thousand Splendid Suns","Khaled Hossaini ",550,2,1000f);
		Book bookObj2 = new Book("80-3-963112","The Pilgrimage","Paulo Coelho",403,1,430f);
		Book bookObj4 = new Book("100-25-4512","Pride and Predujice","Jane Austen",259,9,1500f);
		Book bookObj5 = new Book("52-9-364-81","the little Women","Emily bronte",536,7,800f);
		
		hsObj.add(bookObj);
		hsObj.add(bookObj1);
		hsObj.add(bookObj2);
		hsObj.add(bookObj4);
		hsObj.add(bookObj5);
		
		Iterator<Book> iterator = hsObj.iterator();
		while(iterator.hasNext())
		{
			Book book = iterator.next();
			System.out.println("Books are "+book);
		}
		
	}

}
class Book
{
	String isbnNumber;
	String bookname;
	String author;
	int noOfPages;
	int edition;
	float price;
	public Book(String isbnNumber, String bookname, String author, int noOfPages, int edition, float price) {
		super();
		this.isbnNumber = isbnNumber;
		this.bookname = bookname;
		this.author = author;
		this.noOfPages = noOfPages;
		this.edition = edition;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [isbnNumber=" + isbnNumber + ", bookname=" + bookname + ", author=" + author + ", noOfPages="
				+ noOfPages + ", edition=" + edition + ", price=" + price + "]";
	}
	
	
	

}
