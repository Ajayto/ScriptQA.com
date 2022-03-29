package demoJava;

public class ConstructorInJava {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorInJava c=new ConstructorInJava(10,20);
		ConstructorInJava c1=new ConstructorInJava(10);
		ConstructorInJava c2=new ConstructorInJava();
		

	}
	
	ConstructorInJava(int a,int b){
		System.out.println("this is 2 args constructor");
		
	}
	
	ConstructorInJava(){
		System.out.println("this is default constructor");
	}
	
	ConstructorInJava(int a){
		System.out.println("this is a 1 args constructor");
	}
	 
	 
}
