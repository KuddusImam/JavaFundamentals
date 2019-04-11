package Blocks;

public class StaticBlocks {
	public StaticBlocks() {
		System.out.println("hello");
	}

	static int a;
	static String b;
	static boolean c;
	static char d;
	
	static {
		new StaticBlocks();
		a=10; b="Today"; c=false; d='A';
		System.out.println("Hell Cybertek");
		
	}
	

	public static void main(String[] args) {
		System.out.println( a+" "+b+" "+c+" "+d );
		
		System.out.println("Hell World");

	}

}
