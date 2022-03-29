package abstractExample;

public class DemoAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d= new Demo1();
		d.display();
		d.show();
		d.print();
	}

}


abstract class Demo{
	abstract void show();
	abstract void print();
	void display() {
		System.out.println("this is display method of abstract");
	}
}
class Demo1 extends Demo{
	void show() {
		System.out.println("this is show method of demo1");
	}
	void print() {
		System.out.println("this is print method demo1");
	}
	
}
