package Polymorphisims;

class A{
	public A(){
		System.out.println("A");
		
		
	}
	public A(int b){
		System.out.println("hello");
	}
	
}

class B extends A{
	public B(){
		System.out.println("B");
	}
	public B(int z){
	//	this();
		super(18);
		System.out.println("hola");
	}
	
}


public class Constructor {

	public static void main(String[] args) {
		B obj=new B();   // A B
		B obj2=new B(10);  // A Hoal
		
		A obj3=new A(); // A
		System.out.println("\n");
		A obj4=new B();  // AB
		
		A obj5=new B(78); // A Hoal.
		

	}

}
