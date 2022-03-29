package CollectionInJava;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al= new ArrayList();
		al.add(10);
		al.add(20.23f);
		al.add(null);
		al.add(10);
		al.add("Ajay");
		al.add('c');
		
		HashSet hs = new HashSet<>();
		hs.add(10);
		hs.add(10.39);
		hs.add('c');
		hs.add(null);
		hs.add("ScriptQA");
		hs.add(10);
		hs.addAll(al);
		al.add('D');
		
		//System.out.println(hs.contains("amit"));
		System.out.println(hs.containsAll(al)); //true 
		System.out.println(hs);
		System.out.println(al);
	}

}
