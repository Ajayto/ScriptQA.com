package CollectionInJava;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListItratorInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		LinkedList ll= new LinkedList<>();
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(60);
		ll.add(70);
		
		ListIterator itr=ll.listIterator();
		while(itr.hasNext()) {
			Object nextElement=itr.next();
			if(nextElement.equals(30)) {
				itr.set(44);
			}
			System.out.println(itr.nextIndex()+" "+nextElement);
		}
		System.out.println(ll);
//		System.out.println();
//		while(itr.hasPrevious()) {
//			System.out.println(itr.previousIndex()+" "+itr.previous());
//		}

	}

}


//hasNext()
//next()
//nextIndex()

//hasPrevious()
//previous()
//previousIndex()

//remove
//add()
//set();