package Blocks;

class ALL{
	static int a=20;
	ALL(){
		System.out.println("Constrcutor");
	}
	
	static {
		System.out.println("Static block");
	}
	
	{
		System.out.println("Instance block");
	}
	
}


public class StaticInstanceConstructor extends ALL{
	public static void main(String[] args) {
		
		System.out.println(a);
		
		ALL obj1=new ALL();   // static, initilizer, constructor
		ALL obj2=new ALL();   // initilizer, constructor
		ALL obj3=new ALL();		// initilizer, constructor

		// first static blocks, then instance then the constructor.
		
	}

}
