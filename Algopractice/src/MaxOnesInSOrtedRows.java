//Find maximum no of ones in sorted matrix with less complexity
public class MaxOnesInSOrtedRows {
	public static void findmax(int a[][],int n,int m)
	{
		int j=m-1,maxrow=-1;
		for(int i=0;i<n;i++)
		{
			while(j>=0 && a[i][j]==1 )
			{
				maxrow=i;
				j--;
			}
		}
		int maxones=m-j-1;
		System.out.println("maxrow   "+maxrow+"maxnumberofones    "+maxones);
	}
	public static void main(String args[])
	{
		int a[][]={{0, 0, 1, 1, 1}, {0, 1, 1, 1, 1},{0, 1, 1, 1, 1}};
		findmax(a,3,5);
	}
}
