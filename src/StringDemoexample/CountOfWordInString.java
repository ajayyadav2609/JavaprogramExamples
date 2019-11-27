package StringDemoexample;

import java.util.Scanner;

public class CountOfWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the string");
		 
        Scanner sc = new Scanner(System.in);
 
        String s=sc.nextLine();
 
        String[] words = s.trim().split(" ");
 
        System.out.println("Number of words in the string = "+words.length);
		
		//OR
		/*int count=1;
		String s="How are you ajay";
		
		for(int i=0;i<s.length();i++)
		{
			 if((s.charAt(i) == ' ') && (s.charAt(i+1)!=' ')) {  
	                count++;  
	          } 
		}
		//count++;
		System.out.println(count);
		*/

	}

}
