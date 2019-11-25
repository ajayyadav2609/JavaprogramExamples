package Arraydemo;

public class MissingNumber {

	public static void main(String[] args) {
		
		int sum=0;
		int sum1 = 0;
		
		int[] a= {1,2,3,5};
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("value of sum: " + sum);
		
		for(int i=0;i<=5;i++)
		{
			sum1=sum1+i;
		}
		System.out.println("Value of sum1: " + sum1);
	}
	
}
