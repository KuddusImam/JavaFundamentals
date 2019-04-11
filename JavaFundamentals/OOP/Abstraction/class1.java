package Abstraction;

 public abstract class class1 {
	 public class1(){
		System.out.println("Hello"); 
	 }
	 
	//  class1 obj=new class1();  abstract class cannot be object type.

	abstract public void method();
	
	abstract public String method2();
	
//	abstract public int method3() {};   abstract method can't have body. 
	
//	abstract static public void method5();  // abstract method cannot be either static or final
	
//	abstract private void mm();			// abstract methods cannot be private.
	
// override method has to happen in multiple class.
		// overloading can exist in a single class
	public void method7(int a) {
		
	}
	public void method7(int a, int b) {
		
	}	
	
}

  
 
 
 
 
 