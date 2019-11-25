package StringDemoexample;

public class CharactercountInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="Java is good";
		 int count=0;
		 
		 for(int i=0;i<st.length();i++)
		 {
			 if(st.charAt(i)!= ' ') // remove spaces before count
				 count++;
		 }
		 System.out.println("size of string: " + count); // for count number of character
		 System.out.println("Total length of string: " + st.length());
		 System.out.println(st);
		

	}

}
