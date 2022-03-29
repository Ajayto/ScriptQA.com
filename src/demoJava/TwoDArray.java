package demoJava;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[][]= {{20,30,40,40},{50,60,80},{60,40,20}};
		//System.out.println(a.length);
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print("  "+a[i][j]);
			}
			System.out.println();
		}
		
		

	}

}
