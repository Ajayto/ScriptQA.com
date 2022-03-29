package demoJava;

public class MethodsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsInJava obj1= new MethodsInJava();  //object creation
		int result=obj1.add(100, 30);  
		System.out.println(result);
		
     
	}
	
   int add(int a,int b) {
	  int c=a+b;
	  return c;
   }

}
