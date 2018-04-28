import java.util.Scanner;

public class HeapSort {
	public static void sort(int ar[],int n,int sc)
	{
		for(int i=n/2-1;i>=0;i--)
			heapify(ar,i,n);
		int k=1;
		for(int i=n-1;i>=0;i--)
		{
			int temp=ar[i];
			ar[i]=ar[0];
			ar[0]=temp;
			heapify(ar,0,i);
			k++;
			if(sc==k)
				break;
		}
	}
	public static void heapify(int ar[],int i,int n)
	{
		int largest=i;
		int left=2*i+1;
		int right=2*i+2;
		if(left<n && ar[largest]<ar[left])
			largest=left;
		if(right<n && ar[largest]<ar[right])
			largest=right;
		if(largest!=i)
		{
			int swap=ar[i];
			ar[i]=ar[largest];
			ar[largest]=swap;
			heapify(ar,largest,n);
		}
		
	}

	public static void main(String[] args) {
		int ar[]= {2,4,3,-1,8,6,5};
		Scanner sc=new Scanner(System.in);
		int sc1=sc.nextInt();
		sort(ar,ar.length,sc1);
		for(int i=0;i<ar.length;i++)
			System.out.println(ar[i]+"  ");
		
	}

}
