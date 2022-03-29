package ExceptionHandling;

import java.io.IOError;
import java.io.IOException;

public class UnCheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=30;
		String s= "svgdvg";
		int arr[] ={1,3};
		try {
			System.out.println(number/1); /// risky code / 0
			System.out.println(s.substring(2));   //null pointer 
			System.out.println(arr[1]);   //out of bond
		}

		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("this is Exception catch bloak");
		}
		finally {
			System.out.println("this is finally block");
		}

		System.out.println("Hi all welcome to java class ");

	}

}
