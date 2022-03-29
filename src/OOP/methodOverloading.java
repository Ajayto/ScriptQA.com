package OOP;

public class methodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		methodOverloading m = new methodOverloading();
		System.out.println("result ="+m.add(10, 20));
		System.out.println("result ="+m.add(10.10f, 20));
		System.out.println("result ="+m.add(10, 20,30));
	}

public	int add(int a, int b) {
		System.out.println("add 2 int number");
		return a+b;
	}
private	float add(float a, int b) {
		System.out.println("add one float one int number");
		return a+b;
	}
	
protected float add(int a, float b) {
		System.out.println("add 1 int one float number");
		return a+b;
	}
	
	float add(float a, float b) {
		System.out.println("add two 2 float number");
		return a+b;
	}

	int add(int a, int b,int c) {
		System.out.println("add 3 int number");
		return a+b+c;
	}
	int add(int a, int b,int c, int d) {
		System.out.println("add 4 int number");
		return a+b+c+d;
	}

}
