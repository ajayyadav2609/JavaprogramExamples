package StringDemoexample;

public class FindDuplicateCharacter {

	public static void main(String[] args) {
		String str = "W3schoolsofleasrning";
		int cp =0;
		char[] chArr =str.toCharArray();
		System.out.println("Duplicate character");
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(chArr[i]==chArr[j])
				{
					System.out.println(chArr[j]);
					cp++;
					break;
				}
			}
		}
		
		

	}

}
