
public class power {
	static int power(int x,int y)
	{
		int temp;
		if(y==0)
			return 1;
		temp=power(x,y/2);
		System.out.println("x==="+x+"y=="+y
				+"temp=="+temp);
		
		if(y%2==0)
			return temp*temp;
		else
			return x*temp*temp;
		
		
	}
	public static void main(String[] args) {
		
		System.out.println("Ans is ::"+power(2,5));
	}

}
