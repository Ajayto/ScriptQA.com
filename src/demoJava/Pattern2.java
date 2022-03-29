package demoJava;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int totalRow=5;
		for(int r=1;r<=totalRow;r++) {
		 for(int sp=1;sp<=totalRow-r;sp++){
			 System.out.print(" ");
		 }
		  for(int st=1;st<=r;st++) {
			  System.out.print("*");
		  }
		  System.out.println();
		}

	}

}
