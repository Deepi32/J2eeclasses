class M1
{
	int i;
	M1(int i)
	{
		this.i=i;
	}
}

class M implements Cloneable
{
	M1 m;
	int j;
	M(M1 m,int j)
	{
		this.m=m;
		this.j=j;
	}
	public Object clone()throws CloneNotSupportedException
	{
		M1 m1=new M1(m.i);
		M a1=new M(m1,j);
		return a1;
		
	}

}
public class deepcloning {
	public static void main(String args[]) throws CloneNotSupportedException
	{
		M1 m1=new M1(10);
		M m=new M(m1,12);
		M m2=(M)m.clone();
		m2.j=145;
		m2.m.i=16;
		System.out.println(m.j+"  "+m.m.i);
		System.out.println(m2.j+"  "+m2.m.i);
		
	}
}
