package programdemo;

import java.util.Scanner;

public class ArmstrongExample {

	public static void main(String[] args) {
		int c =0,a,temp;
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number");
		int count = sc.nextInt();*/
		int n= 256;
		temp=n;
		
while(n>0)
{
	a=n%10;
	n=n/10;
	c=c+(a*a*a);
}
if(temp==c)
{
	System.out.println("Is Armstrong");
}
else
{
	System.out.println("NOt a armstrong");
}

	}}
	
	//Method 2
	
	/*public boolean isArmStrongNumber(int number)
	 {
	  int sum=0;
	  int originalNumber=number;
	  while(number!=0)
	  {
	   
	  int remainder=number%10;
	  sum=sum+remainder*remainder*remainder;
	  number=number/10;
	  }
	  if(originalNumber==sum)
	  {
	   return true;
	  }
	  return false;
	 }
	}
	 public static void main(String[] args)
 {
   CheckArmStrongNumberMain casnm=new CheckArmStrongNumberMain();
  System.out.println(" Is 153 Armstrong number: "+casnm.isArmStrongNumber(153));
  System.out.println(" Is 234 Armstrong number: "+casnm.isArmStrongNumber(234));
     System.out.println(" Is 371 Armstrong number: "+casnm.isArmStrongNumber(371));
 }
*/