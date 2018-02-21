
public class arraydeclare {

	public static void main(String[] args) {
		int ar[]={4,4,5,6};
		int ar1[]=new int[7];
		
		Class c=ar.getClass();
		String name=c.getName();
		System.out.println("name is "+name);
		System.arraycopy(ar, 1, ar1, 0, 3);
		for(int i=0;i<ar1.length;i++)
			System.out.print(ar1[i]);
	}

}
