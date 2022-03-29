package abstractExample;

public interface MyInterface {
	int a=10;
	void show();
	void display();
    void get();
}

class A implements MyInterface{
	public void show() {
		//a=40;
		System.out.println("this show mrthod");
	}
	
	public void display() {
		System.out.println(" This is display method");
	}
	public void get() {
		System.out.println(" this is get method");
	}
}
