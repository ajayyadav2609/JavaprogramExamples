package programdemo;

import java.util.Scanner;

public class ConvertDecimalToBinary {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		String str = Integer.toBinaryString(num);
		System.out.println("Binary Number is " +str);
		
		}

}
