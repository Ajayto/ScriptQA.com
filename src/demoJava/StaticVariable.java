package demoJava;

public class StaticVariable {
	
	int a=20;
	static int b=20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariable sv=new StaticVariable();	
		sv.a++;
		sv.b++;
		System.out.println("A="+sv.a+" B="+sv.b);
		
		
		StaticVariable sv1=new StaticVariable();
		sv1.a++;
		sv1.b++;
		System.out.println("A="+sv1.a+" B="+sv1.b);
		
		
		StaticVariable sv2=new StaticVariable();
		sv2.a++;
		sv2.b++;
		System.out.println("A="+sv2.a+" B="+sv2.b);

	}

}
