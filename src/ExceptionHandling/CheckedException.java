package ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckedException c= new CheckedException();
		c.getDataFromFile();
		
		

	}
	
	void getDataFromFile()  {
		try {
		fileRead();
		}
		catch(Exception e) {
			
		}
	}
	
	void fileRead() throws FileNotFoundException {
		FileInputStream fs= new FileInputStream("C:\\Users\\Ajay\\Desktop\\javaProg\\assignemt.txt");
		File f= new File("fs");
	}

}
