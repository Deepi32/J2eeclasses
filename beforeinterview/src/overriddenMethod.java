import java.io.*;  
class Parent{  
  void msg()throws ArithmeticException{System.out.println("parent");}  
}  
  
class overriddenMethod extends Parent{  
  void msg()throws ArrayIndexOutOfBoundsException{System.out.println("child");}  
  
  public static void main(String args[]){  
   Parent p=new overriddenMethod();  
   try{  
   p.msg();  
   }catch(Exception e){}  
  }  
}  
