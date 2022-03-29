package InterfaceEx;

public interface A {
 int a=1; 
 
void getData();
}



abstract class AbsDemo{
	{
		 
	 }
	 
	 static {
		 
	 }
	 
	 AbsDemo(){
		 
	 }
private static int a;
}








class B{
	void getData() {
		System.out.println("Class B get data");
	}
}

class C extends B implements A{
	public void getData() {
		System.out.println("Class c get data method");
	}
}
