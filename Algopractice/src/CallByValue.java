class Point
{
	int x;
	int y;
}



public class CallByValue {
	static void swap(Point pt1,Point pt2)
	{
		Point temp;
		temp=pt1;
		pt1.x=pt2.x;
		pt2.x=temp.x;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point pt1=new Point();Point pt2=new Point();
		pt1.x=0;
		pt1.y=1;
		pt2.x=100;
		pt2.y=200;
		System.out.println("Point1 is:::"+pt1.x+": "+pt1.y+"point 2 is ::"+pt2.x+": "+pt2.y);
		System.out.println("After swapping:::::::::::::::::");
		swap(pt1,pt2);
		System.out.println("Point1 is:::"+pt1.x+": "+pt1.y+"point 2 is ::"+pt2.x+": "+pt2.y);
		
		

	}

}
