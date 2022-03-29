package CollectionInJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,String> hm= new HashMap<>();
		hm.put("1001", "Sumit");
		hm.put("1002", "Tom");
		hm.put("1004", "sumit");
		hm.put("1005", "Ajay");
		// with for each and keySet();
//		for(String eachKey:hm.keySet()) {
//			System.out.print("key="+eachKey);
//			System.out.println(" value="+hm.get(eachKey));
//		}
//		//with foreach and entrySet()
		for(Entry<String, String> eachEntry:hm.entrySet()) {
			System.out.println("Key="+eachEntry.getKey()+" value="+eachEntry.getValue());
		}
	}

}
