package demoJava;

public class ArrayInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxNumber=0;
		int []a= {12,80,30,120,50,400,70};
		
		for(int i=0;i<a.length;i++) {
		  if(maxNumber<a[i]) {
			  maxNumber=a[i];
		  }	
		}		
		System.out.println(maxNumber);
	}

}
