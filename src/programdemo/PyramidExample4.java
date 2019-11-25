package programdemo;

import java.util.Scanner;

public class PyramidExample4 {

	public static void main(String[] args) {
		
		/*Scanner SC = new Scanner(System.in);
		System.out.println("Enter number: ");
		int Rows = SC.nextInt();*/
		
		int i,j,k=5;
		
		for(i=0; i<5;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("");
			}
			for(int K=1;K<=i;K++)
			{
			 System.out.println("&");	
			}
			System.out.println();
		}
		

	}

}
