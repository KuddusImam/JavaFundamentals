package Blocks;


class blocks{
	
	static {
		System.out.println("Hello");
	}
	
	{
		System.out.println("Hola");
	}
	
}

public class InstanceBlock extends blocks{
	
	
	public static void main(String[] args) {		
		blocks obj1=new blocks();
		blocks obj2=new blocks();
		blocks obj3=new blocks();
		blocks obj4=new blocks();
	}

}
 class C extends InstanceBlock{
	 public static void main(String[] args) {
		C obj=new C();
		 
		 
	}
 }




