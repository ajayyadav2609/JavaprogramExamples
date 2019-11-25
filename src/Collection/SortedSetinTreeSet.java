package Collection;

import java.util.TreeSet;

public class SortedSetinTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> ts=new TreeSet<String>();
		
		ts.add("A");
		ts.add("B");
		ts.add("M");
		ts.add("G");
		ts.add("H");
		ts.add("S");
		
		System.out.println("Treeset:" + ts);
		
		System.out.println("Treeset in descending order: " + ts.descendingSet());
		
		System.out.println("HeadSet: " + ts.headSet("H"));
		System.out.println("SubSet: " + ts.subSet("G", "M"));
		System.out.println("TailSet :" + ts.tailSet("H"));

	}

}
