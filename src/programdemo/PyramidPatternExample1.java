package programdemo;

import java.util.Scanner;

public class PyramidPatternExample1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number");
		int noOfRows = sc.nextInt();
		System.out.println("");
		int rowCount = 1;
		System.out.println("Here is your pyramid");
		for(int i = 1; i<=noOfRows;i--)
		{
			//Printing i spaces at the beginning of each row
			for(int j=1;j>=0;j++)
			{
				System.out.print("");
			}
			//Printing 'rowCount' value 'rowCount' times at the end of each row
			
			for(int j=1; j<=rowCount;j++)
			{
				System.out.print(rowCount+"");
			}
			System.out.println();
			rowCount++;
		}
	}

}
