package demoJava;

public class demoThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		demoThis d= new demoThis();
		
	}
	demoThis(){
		this(10);
		System.out.println("0 args ");
	}
	demoThis(int a){
		this(20,30);
		System.out.println("one args");
		
	}

	demoThis(int a,int c){
		//this();
		System.out.println("2 args");
	}

}
