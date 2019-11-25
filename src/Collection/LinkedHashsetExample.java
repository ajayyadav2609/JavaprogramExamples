package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		
		lhs.add(1);
		lhs.add(2);
		lhs.add(3);
		lhs.add(4);
		lhs.add(5);
		lhs.add(1);
		
		Iterator<Integer> it=lhs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		lhs.remove(3);
		System.out.println(lhs);
		
		lhs.clear();
		
		System.out.println("After clear all element" + lhs);
		System.out.println("After retain all element" + lhs.retainAll(lhs));
		

	}

}
