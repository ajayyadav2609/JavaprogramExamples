package programdemo;

import java.util.Scanner;

public class FabonacciSeriesExample {

	public static void main(String[] args) {
		
		int n1=0,n2=1,n3,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number");
		int count = sc.nextInt();
		
		System.out.print(n1+" "+n2);//printing 0 and 1
		
		for(i=2;i<count;i++)// Starting from 2 as we already print 0 and 1 
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
		
	}
