package CollectionInJava;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkListInJava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al= new ArrayList();
		al.add(10);
		al.add(20.23f);
		al.add(null);
		al.add(10);
		al.add("Ajay");
		al.add('c');
		
		LinkedList ll= new LinkedList<>();
		ll.add(30);
		ll.add(40);
		ll.add("ScriptQA");
		ll.add("30");
		ll.add(null);
		ll.add(30.40f);
		//System.out.println(ll);
		ll.add(2,11);
		//System.out.println(ll);
		ll.addAll(3,al);
		al.add(70.80f);
//		System.out.println(al);
	System.out.println(ll);
//		
//		System.out.println(ll.containsAll(al));
		
//		System.out.println(ll.get(0));
//		System.out.println(ll.getFirst());
//		System.out.println(ll.getLast());
		System.out.println(ll.lastIndexOf(10));
		System.out.println(ll.);
	}

}
