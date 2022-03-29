package demoJava;

public class StaticMethod {
	static int a=30;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StaticMethod sm=new StaticMethod();
//		sm.display();
		//StaticMethod.display();
		StaticMethod.show();
		
	}
	
	
	void display() {
		display1();
		System.out.println("this is instance method of display");
	}
	
	
	static void display1() {
		System.out.println("this is instance method of display1");
	}
	
	
	
	static void show() {
		//StaticMethod sm= new StaticMethod();
		display1();
		System.out.println(a);
		System.out.println("this is static method");
	}

}
