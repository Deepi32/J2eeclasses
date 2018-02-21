 abstract class ParentAbstract {
    public static int parentInt=80713; 
    static{
        System.out.println("parent static executed");
        parentInt=9;
    }

    public ParentAbstract(){
        System.out.println("parentAbstract initialized");
    }

    public void MethodInParent(){
        System.out.println("MethodInParent called");
    }

}
 class ChildExtending extends ParentAbstract{

	    public int childInt =111213;
	    static{
	        System.out.println("child static block executed");
	    }

	    public ChildExtending() {
	        System.out.println("child const initialized");
	    }
	    public void MethodInChild(){
	        System.out.println("MethodInChild called");
	    }
	    public static void main(String[] args){
	        System.out.println(ParentAbstract.parentInt);
	        System.out.println(ChildExtending.parentInt);
	    }
	}
class AB1
{
	static
	{
		int i=0;
		System.out.println("In static block");
	}
	AB1()
	{
		System.out.println("In constructor");
		//i=6;
	}
	
}
public class staticblockexample {
	public static void main(String args[])
	{
		//AB1 ab=new AB1();
	//	AB1 ab1=new AB1();
		System.out.println("Inside main");
		 ChildExtending ce = new ChildExtending();
	        ce.MethodInParent();
	}
	
}
