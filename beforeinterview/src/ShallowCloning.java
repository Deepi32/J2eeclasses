class BB
{
	int j;
	BB(int j)
	{
		this.j=j;
	}

}

class C implements Cloneable
{
	BB b;
	int i;
	C(BB b,int i)
	{
		this.b=b;
		this.i=i;
	}
	int j;
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
}
public class ShallowCloning  {

	public static void main(String[] args) throws CloneNotSupportedException {
		BB b=new BB(10);
		C c=new C(b,12);
		System.out.println(c.i+" "+c.b.j);
		C d=(C)c.clone();
		d.i=12;
		d.b.j=30;
		System.out.println(d.i+" "+d.b.j);
		System.out.println(c.i+" "+c.b.j);
	}

}
