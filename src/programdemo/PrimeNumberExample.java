package programdemo;

import java.util.Scanner;

public class PrimeNumberExample {

	public static void main(String[] args)
	{
		/*int i,n,m=0,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number");
		int count = sc.nextInt();
		m=n/2;
		if(n==0 ||n==1)
		{
			System.out.print("is prime number");
		}else
		{
			for(i=2;i<m;i++)
			{
				if(n%2==0)
				{
					System.out.print("is not prime number");
					flag=1;
					break;
				}
			}
		
			if(flag==0)
			{
				System.out.println(n + "is prime Number");
			}
		
		}

	}*/
		
		System.out.println("17 number is " +isPrime(17));
		System.out.println("20 number is " +isPrime(20));
	}

		//Method 2
		
		public static boolean isPrime(int Number)
		{
			for(int i=2;i<= Math.sqrt(Number);i++)
			{
				if(Number%i==0)
					return false;
			}
				return true;
		}
		
}
