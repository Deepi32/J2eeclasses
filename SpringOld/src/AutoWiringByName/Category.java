package AutoWiringByName;

public class Category {
	String catgname;
	Book bk;
	public Book getBk() {
		return bk;
	}
	public void setBk(Book bk) {
		this.bk = bk;
	}
	public String getCatgname() {
		return catgname;
	}
	public void setCatgname(String catgname) {
		this.catgname = catgname;
	}
	public void show()
	{
		System.out.println("catgname is ::"+catgname+" BookName is ::"+bk.BookName+"price is ::"+bk.BookPrice);
	}
	

}
