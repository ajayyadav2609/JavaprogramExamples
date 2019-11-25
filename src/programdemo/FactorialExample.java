package programdemo;

import java.util.Scanner;

public class FactorialExample {

	public static void main(String[] args) {
		int i,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number");
		int count = sc.nextInt();
		
		for(i=1;i<=count;i++)
		{
			fact=fact*i;
		}
		
		System.out.println("Factor of " +fact);

	}

}
