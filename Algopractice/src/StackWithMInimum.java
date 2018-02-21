import java.util.Stack;


public class StackWithMInimum {
	Stack s;
	int top;
	Integer minel;
	StackWithMInimum(){
		s=new Stack();
	}
	public int getmin()
	{
		if(s.isEmpty())
			return -1;
		return minel;
	}
	public void push(int el)
	{
		if(s.isEmpty())
		{
			s.push(el);
			minel=el;
			return;
		}
		if(el<minel)
		{
			
			s.push(2*el-minel);
			minel=el;
		}
		else
			s.push(el);
	}
	public int pop()
	{
		if(s.isEmpty()){
			System.out.println("Stack is empty");
			return -1;
		}
		int el=(Integer) s.pop();
		int el1=el;
		if(el<minel)
		{
			el1=minel;
			minel=2*minel-el;
		}
		return el1;
	}
	public static void main(String args[])
	{
		StackWithMInimum st=new StackWithMInimum();
		st.push(2);
		st.push(1);
		st.push(3);
		System.out.println(st.getmin());
		System.out.println(st.pop());
		st.push(6);
		System.out.println(st.getmin());
	}
}
