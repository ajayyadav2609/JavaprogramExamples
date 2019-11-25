package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Hashsetexample {

	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<String>();
		
		hs.add("Ajay");
		hs.add("Java");
		hs.add("selenium");
		hs.add("Automation"); // add new item
		hs.add("PHP");
		hs.add("selenium");
		hs.add("");
		
		System.out.println(hs);
		
		hs.remove("PHP");
		
		Iterator<String> it=hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		HashSet<String> hs1=new HashSet<String>();
		
		hs1.add("One");
		hs1.add("Two");
		hs1.add("Three");
		
		hs1.addAll(hs);
		
		System.out.println("after adding hs to hs1");
		System.out.println(hs1);
		hs1.remove("Three");
		System.out.println("After removal : "+ hs1);
		
		hs.removeIf(str->str.contains("Automation"));
		System.out.println("After removing automation" + hs);
		
		System.out.println("hascode is : " + hs.hashCode());
		
		
		// Hashset from another collection
		
		ArrayList<String> ar=new ArrayList<String>();
		
		ar.add("1");
		ar.add("2");
		ar.add("3");
		ar.add("4");
		ar.add("3");
		ar.add("4");
		
		System.out.println(ar);
		
		HashSet<String> set = new HashSet<String>(ar);
		set.add("5");
		set.add("6");
		
		System.out.println("Set : " +set);
		
		
		
		

	}

}
