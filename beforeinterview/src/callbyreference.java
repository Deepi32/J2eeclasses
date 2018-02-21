
public class callbyreference {
	public void change(Object i,Object i1)
	{
		Object temp=i;
		i=i1;
		i1=temp;
		
	}
	
	public static void main(String[] args) {
		Object i=new Integer(5);
		Object i1=new Integer(51);
		System.out.println(i+"  "+i1);
		callbyreference cb=new callbyreference();
		cb.change(i,i1);
		System.out.println(i+"  "+i1);

	}

}
