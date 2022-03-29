package demoJava;

public class StaticBlock {
	//final static int a;

	{
		System.out.println("this is instance block");
	}
	
	static {
		System.out.println("this is static block");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a=10;
		StaticBlock sb= new StaticBlock();
		System.out.println("this is main method");
		StaticBlock sb1= new StaticBlock();
		
		

	}

}
