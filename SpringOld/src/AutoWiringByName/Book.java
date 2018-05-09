package AutoWiringByName;

public class Book {
	String BookName;
	String BookPrice;
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getBookPrice() {
		return BookPrice;
	}
	public void setBookPrice(String bookPrice) {
		BookPrice = bookPrice;
	}
	public String toString()
	{
		return BookName+BookPrice;
	}

}
