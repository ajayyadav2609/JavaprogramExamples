package programdemo;

import java.util.Scanner;

public class PalindromExample {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);		
		System.out.println("Please enter the String/number");
		String str=sc.nextLine();
		String Reversestr = "";
		for(int i=str.length()-1;i>=0;i--)
		{
			Reversestr = Reversestr + str.charAt(i);
		}
		
		if(str.equalsIgnoreCase(Reversestr))
		{
			System.out.println("is palindrom");
		}
		else
		{
			System.out.println("Not a palindrom");
		}
		

	}

}
