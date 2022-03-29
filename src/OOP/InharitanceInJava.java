package OOP;

public class InharitanceInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
      C c= new C();
      System.out.println("c="+c.c);
      c.print();
      System.out.println("B="+c.b);
      c.message();
      System.out.println("A="+c.a);
      c.printMsg();
      
	}
}
class A{
	int a=30;
	void printMsg() {
		System.out.println(" this is printMsg method of class A");
		//message();
	}
}

class B extends A {
	int b=40;
	void message() {
		System.out.println("this is message method of class B");
	}
}

class C extends B{
	int c=10;
	void print() {
		System.out.println("this is print method of C class");
	}
}







