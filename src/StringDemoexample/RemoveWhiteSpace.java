package StringDemoexample;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st="Java is Good";
		char ch='*';
		
		//Replace space with specific character ch    
        st = st.replace(' ', ch);
		System.out.println("String after replace: " + st);
		
		for(int i=0;i<=st.length(); i++)
		{
			st= st.replaceAll("\\s+", "");
		}
		System.out.println("String after white space removal: " + st);
		st=st.toLowerCase();
		System.out.println("String after convert to Lowercase: " + st);
		st=st.toUpperCase();
		System.out.println("String after convert to Upercase: " + st);
		
	}

}
