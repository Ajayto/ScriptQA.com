package CollectionInJava;

import java.util.Vector;

public class VectorInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v =new Vector();
		v.add(10);
		v.add(20.20f);
		v.add("Java");
		v.add('c');
		v.add(null);
		v.add(20.20f);
		v.add("Java");
		System.out.println(v);
		for(Object eachElement:v ) {
			System.out.println(eachElement);
		}
		

	}

}
