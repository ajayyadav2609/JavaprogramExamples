package StringDemoexample;

public class CharacterOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Java is good language";
		
		long Occurs=s.chars().filter(ch ->ch=='g').count();
		
		System.out.println("countof g: " + Occurs);

	}

}
