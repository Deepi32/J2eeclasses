class BB1
{
	int j;
	BB1(int j)
	{
		this.j=j;
	}

}

class C1 implements Cloneable
{
	BB1 b;
	int i;
	C1(BB1 b,int i)
	{
		this.b=b;
		this.i=i;
	}
	int j;
	public Object clone() throws CloneNotSupportedException
	{
		BB1 b1=new BB1(b.j);
		C1 cc=new C1(b1,i);
		return cc;
	}
	
}

public class deepCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		BB1 b=new BB1(10);
		C1 c=new C1(b,12);
		System.out.println(c.i+" "+c.b.j);
		C1 d=(C1)c.clone();
		d.i=12;
		d.b.j=30;
		System.out.println(d.i+" "+d.b.j);
		System.out.println(c.i+" "+c.b.j);
	}


}
