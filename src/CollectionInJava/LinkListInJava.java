package CollectionInJava;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkListInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll= new LinkedList<>();
		ll.add(10);
		ll.add(20.40f);
		ll.add("java");
		ll.add('c');
		ll.add(null);
		ll.add("java");
		ll.add(null);
		System.out.println(ll);
		
		
		ArrayList al= new ArrayList();
		al.add(10);
		al.add(20.23f);
		al.add(null);
		al.add(10);
		al.add("Ajay");
		al.add('c');
		
		ll.addAll(1,al);
		ll.push("Abcd");
		System.out.println(ll);
		ll.pop();
		System.out.println(ll);
//		for(Object echElement: ll) {
//			System.out.println(echElement);
//		}
	}

}
