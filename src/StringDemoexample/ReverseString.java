package StringDemoexample;

/*1) Using StringBuffer class
In this method, we use reverse() method of StringBuffer class to reverse the string.
Here is the code snippet to reverse the string using reverse() method of StringBuffer class

2) Using iterative method
In this method, first we convert given string to char array using charArray() method. 
And then we iterate that array in the reverse order.

3) Using recursive method.
Here is the method which reverses the string by calling itself recursively.

This method takes the first character of a string (str.charAt(0)) and puts it at the end of the string. And then calls itself on the remainder of the string (str.substring(1)). Finally adds these two things to get the reverse of the passed string (recursiveMethod(str.substring(1)) + str.charAt(0)). When the passed string is one character or less (str.length() <= 1), it stops calling itself and just returns the string passed.

If the “MyJava” is the string to reverse, then this method works like this.

1st Call —>   recursiveMethod(“MyJava”)
2nd Call —> recursiveMethod(“yJava”) + “M”
3rd Call —>  (recursiveMethod(“Java”) + “y”) + “M”
4th call —>  ((recursiveMethod(“ava”) + “J”)+”y”) + “M”
5th Call —>  (((recursiveMethod(“va”) + “a”) + “J”)+”y”) + “M”
6th Call —>  ((((recursiveMethod(“a”) + “v”) + “a”) + “J”)+”y”) + “M”

After 6th call, it Stops calling itself. Because the length of passed string is 1. So, finally it returns “avaJyM”.

*/

public class ReverseString {

	public static void main(String[] args) {
		String str = "My Java prog";
		//1) Using StringBuffer class
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse()); //Output : avaJyM
		
		//2. Using iterative method
		
		char[] strArray = str.toCharArray();
		for(int i= strArray.length-1;i >=0;i--)
		{
			System.out.print(strArray[i]);
		}
		System.out.println();
		//3. Using Recursive Method
		
		System.out.println(RecursiveMethod(str));
			
	}
	
	//3. Create Recursive Method and call in main method
	static String RecursiveMethod(String str)
	{
		if(str ==null || str.length()<=1)
		{
			return str;
		}
		return RecursiveMethod(str.substring(1))+ str.charAt(0);
		
	}

}



