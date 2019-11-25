package Collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hs=new HashMap<Integer,String>();
		System.out.println("Initial hashmap: " +hs);
		
		hs.put(1, "Ajay");
		hs.put(2, "Vijay");
		hs.put(5, "Sanjay");
		hs.put(4, "jay");
		hs.put(3, "Ajay");
		
		System.out.println("After addition: " + hs);
		
		for(Entry<Integer, String> m:hs.entrySet())
		{
			System.out.println(m.getKey() + ":" +m.getValue());
		}
		
		hs.putIfAbsent(6, "Another");
		
		System.out.println("After applying putIfabsent method");
		
		for(Entry<Integer, String> m1:hs.entrySet())
		{
			
			System.out.println(m1.getKey()+ ":" +m1.getValue());
		}
		
		
		HashMap<Integer,String> hs2=new HashMap<Integer,String>();
		hs2.put(7, "Ranjay");
		hs2.put(8, "Sujay");
		hs2.put(9, "Mritunjay");
		hs2.put(10, "Ranjay");
		
		
		System.out.println(hs2.entrySet());
		
		hs2.putAll(hs); // put all hs element in hs2
		
		System.out.println("Put all element of hs to hs2: " +hs2);
		
		hs2.remove(8);
		System.out.println("After removal of 8 element: " +hs2);
		
		hs2.remove("Ajay"); // can't remove because it remove by key, see previous remove command
		
		hs2.remove(10, "Ranjay");
		System.out.println("After removal of 10 element by key value: " +hs2);
		
		hs2.replace(3, "Ajay2");
		System.out.println("After replace 3 key: Ajay to Ajay2: " +hs2);
		
		hs2.replaceAll((k,v)->"Ajay");
		System.out.println("After replace all key and values: Ajay: " +hs2);
		System.out.println("keyset: " + hs2.keySet());
		System.out.println("Values: " + hs2.values());
		System.out.println("Clone:" + hs2.clone());
		
		

	}

}
