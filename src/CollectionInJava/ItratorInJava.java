package CollectionInJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;

public class ItratorInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet al= new HashSet<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add("Java");
		
		for(Object nextElemnt: al) {
			System.out.println(nextElemnt);
			
		}
		System.out.println();
		Iterator itr= al.iterator();   // call iterator() method 
		
		while(itr.hasNext()) {  /// next element is avaliable
			Object element=itr.next();
			if(element.equals(30)) {
				itr.remove();
			}
			//System.out.println(element);  // print element
			
		}
		System.out.println(al);

	}

}
