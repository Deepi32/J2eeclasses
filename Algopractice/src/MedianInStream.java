import java.util.Comparator;
import java.util.PriorityQueue;
class MyComp implements Comparator
{
	public int compare(Object i1,Object i2)
			{
				Integer i11=(Integer) i1;
				Integer i12=(Integer) i2;
				return i12.compareTo(i11);
			}
}

public class MedianInStream {
	PriorityQueue<Integer> minheap,maxheap;
	static int total_element;
	MedianInStream(){
		minheap=new PriorityQueue<Integer>();
		maxheap=new PriorityQueue<Integer>(new MyComp());
	}
	public void add(int el)
	{
		System.out.println("element="+total_element);
		System.out.println(minheap);
		System.out.println(maxheap);
		maxheap.add(el);
		if(total_element%2==0)
		{
			if(minheap.isEmpty())
			{
				total_element++;
				return;
			}
			else
			{
				System.out.println("maximum peek="+maxheap.peek()+"minimum peek ="+minheap.peek());
				if(maxheap.peek()>minheap.peek())
				{
					int temp=maxheap.poll();
					maxheap.add(minheap.poll());
					minheap.add(temp);
					
				}
			}
		}
		else
			minheap.add(maxheap.poll());
		total_element++;
	}
	 int getmedian()
	{
		if(total_element%2!=0)
			return maxheap.peek();
		else
			return (maxheap.peek()+minheap.peek())/2;
	}
	public static void main(String args[])
	{
		MedianInStream ms=new MedianInStream();
		ms.add(5);
		//System.out.println(ms.getmedian());
		ms.add(15);
		//System.out.println(ms.getmedian());
		ms.add(15);
		//System.out.println(ms.getmedian());
		ms.add(3);
		//System.out.println(ms.getmedian());
		ms.add(1);
		ms.add(2);
		ms.add(13);
		ms.add(30);
		
	}
	
}
