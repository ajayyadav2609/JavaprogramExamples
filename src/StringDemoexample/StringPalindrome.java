package StringDemoexample;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		
		String str;
		String rev = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		
		str=sc.nextLine();
		int length = str.length();
		
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		if(str.equalsIgnoreCase(rev))
		{
			System.out.println("String is palindrome: " + str);
		}else
		{
			System.out.println("String is not palindrome" + str);
		}

	}

}
