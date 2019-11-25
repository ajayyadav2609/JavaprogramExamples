package StringDemoexample;

public class StringVowelandConsonantNumber {

	public static void main(String[] args) {
		
		int vowel = 0;
		int consonant =0;
		String st="This is java Language";
		System.out.println("Change to Lowercase: " + st.toLowerCase());// Change to lower case
		
		for(int i=0; i<st.length();i++)
		{
			if(st.charAt(i)=='a' || st.charAt(i)=='e' || st.charAt(i)=='i' || st.charAt(i)=='o' || st.charAt(i)=='u' )
			{
				vowel++;
			}else if(st.charAt(i) >= 'a' && st.charAt(i)<='z')
			{
				consonant++;
			}
			
		}
		
		System.out.println("Vowel in String: " + vowel);
		System.out.println("Consonant in String : " + consonant);

	}

}
