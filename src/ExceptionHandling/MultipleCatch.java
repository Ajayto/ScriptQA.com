package ExceptionHandling;

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		String s=null;	
		int a[]= {10,30,40};
		int b=a[1]/0;
		System.out.println(a[2]);
		s.length();
		}
		catch(ArrayIndexOutOfBoundsException svhvhdv) {
			System.out.println("ArrayIndexOutOfBoundsException block");
			System.out.println(svhvhdv.getMessage());
		}
		catch(NullPointerException e) {
			System.out.println("NullPointerException block");
			System.out.println(e.getMessage());
		}
		


		
		finally {
		  System.out.println("This is finallly block");	
		}
	
		System.out.println("This is end of program ");
		

	}

}
