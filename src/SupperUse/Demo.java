package SupperUse;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c =new C();
	}

}


class A{
	int a=30;
	A(){
		System.out.println("Class A constructor");
	}
	A(int a){
		System.out.println("Class A 1 args constructor");
	}
}
class B extends A{
	
	int a=40;
	B(){
		super();
		System.out.println(" class B 0 args ");
	}
	B(int a, int b){
		System.out.println("Class B 2 args constructor");
	}
}
class C extends B{
	int a=50;
	public C() {
		super();
		System.out.println("Class C constructor");
	}
}





