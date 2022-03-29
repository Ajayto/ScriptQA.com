package demoJava;

import java.util.Scanner;

public class DoWhileProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0;
		do {
		System.out.println("plz enter valid option");	
		System.out.println("plz enter number betn 1 to 4");
		Scanner sc= new Scanner(System.in);
		i=sc.nextInt();	
		
			
		} while (i>4);

	}

}
