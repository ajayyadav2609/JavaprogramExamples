package Collection;

import java.util.TreeSet;

public class NavigableSetInTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> ts=new TreeSet();
		
		ts.add("A");
		ts.add("B");
		ts.add("C");
		ts.add("D");
		
		System.out.println("List of TreeSet: " +ts); //A,B,C,D
		
		System.out.println("List in descending order: " +ts.descendingSet());//D C B A
		
		System.out.println("HeadSet: " + ts.headSet("C", true)); // A,B,C - if C is false show only A,B
		System.out.println("SubSet: " + ts.subSet("A", false, "D", true)); // Show B,C,D - remove A
		
		System.out.println("TailSet: " + ts.tailSet("C", true)); // Show from C - C,D
		
		
		
		

	}

}
