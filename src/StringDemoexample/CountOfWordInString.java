package StringDemoexample;

public class CountOfWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=1;
		String s="How are you ajay";
		
		for(int i=0;i<s.length();i++)
		{
			 if((s.charAt(i) == ' ') && (s.charAt(i+1)!=' ')) {  
	                count++;  
	          } 
		}
		//count++;
		System.out.println(count);
		

	}

}
