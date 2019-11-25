package StringDemoexample;

public class RemoveJunkSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="$%&&Testing heloo**&*((*&^";
		String s1= "Hello world";
		
		//use regular expression to remove special character [^a-zA-28-9]
		
		s= s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
		//remove white space
		//s1=s1.replace(" ", "");
		s1=s1.replaceAll("\\s+", "");
		System.out.println(s1);
		
		

	}

}
