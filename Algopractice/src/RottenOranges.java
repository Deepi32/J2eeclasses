
public class RottenOranges {
	static int max=0;
	static void rottenorange(int ar[][],int n,int n1)
	{
		Queue q=
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n1;j++)
			{
				if(ar[i][j]==2)
					getrotten(ar,n,n1,i,j);
			}
		}
		
	}
	public static void getrotten(int ar[][],int n,int n1,int i,int j)
	{
		isrotten(ar,n,n1,i+1,j,ar[i][j]);
		isrotten(ar,n,n1,i-1,j,ar[i][j]);
		isrotten(ar,n,n1,i,j+1,ar[i][j]);
		isrotten(ar,n,n1,i,j-1,ar[i][j]);
	}
	public static void isrotten(int ar[][],int n,int n1,int i,int j,int el)
	{
		if(i<0 || i>=n ||j<0 ||j>=n1 ||ar[i][j]==0 ||ar[i][j]!=1)
			return;
		ar[i][j]=el+1;
		
		

	}

}
