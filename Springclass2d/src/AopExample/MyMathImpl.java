package AopExample;


import org.springframework.stereotype.Component;

@Component
public class MyMathImpl {
	public void add(int i,int j)
	{
		System.out.println("Output is :::::"+(i+j));
	}
	public int sub(int i,int j)
	{
		System.out.println("Output is :::::"+(i-j));
		return (i-j);
	}
	public int div(int i,int j)
	{
		System.out.println("Output is :::::"+(i/j));
		return (i/j);
	}
	

}
