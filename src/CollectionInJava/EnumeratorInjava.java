package CollectionInJava;

import java.util.Enumeration;
import java.util.Vector;

public class EnumeratorInjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v= new Vector<Integer>();
		v.add(10);
		v.add(30);
		v.add(40);
		v.add(50);
		
		 Enumeration<Integer> enm= v.elements();  // call element method
		 while(enm.hasMoreElements()){  // check next element is avaliable or not
			 System.out.println(enm.nextElement());
			 enm.
		 }
		 

	}

}
