package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> ts=new TreeSet<>();
		
		ts.add(1);
		ts.add(2);
		ts.add(3);
		ts.add(4);
		ts.add(1);
		ts.add(3);
		
		Iterator<Integer> i=ts.iterator();
		System.out.println("Bydefault traverse to ascending order");
		while(i.hasNext())
		{
		
			System.out.println(i.next());
		}
		
		System.out.println("Removing first element: " + ts.pollFirst());
		
		//iterate descending order

		Iterator<Integer> i1=ts.descendingIterator();
		
		System.out.println("Traverse to Descending order");
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		System.out.println("Removing last element :" + ts.pollLast()); //4
	}

}
