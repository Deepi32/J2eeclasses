
interface Drawable
{
default void show()
{
	System.out.println("hello i am java 8 improvement");
}
static int cube(int x)
{
	return(x*x*x);
}
void draw();
}
interface Drawable1
{
	default void show()
	{
		System.out.println("hello i am java 8 improvement in Drawable1");
	}
	


}
class Rectangle implements Drawable ,Drawable1
{
public void draw()
{
	System.out.println("I m rectangle");
}

@Override
public void show() {
	// TODO Auto-generated method stub
	Drawable.super.show();
}



}
public class Interface8implement {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Drawable rect=new Rectangle();
		rect.draw();
		System.out.println(Drawable.cube(3));
		rect.show();
	}
}
