package StringDemoexample;

public class SwapString {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "World";
		//String temp="";
		
		System.out.println("Swapping String:" +str1.replace("Hello", "World") +" " +str2.replace("World", "Hello"));
		
		//Or
		
		String a = "Hello"; 
        String b = "World"; 
          
        // Print String before swapping 
        System.out.println("Strings before swap: a = " +  
                                       a + " and b = "+b); 
          
        // append 2nd string to 1st 
        a = a + b; 
          
        // store intial string a in string b 
        b = a.substring(0,a.length()-b.length()); 
          
        // store initial string b in string a 
        a = a.substring(b.length()); 
          
        // print String after swapping 
        System.out.println("Strings after swap: a = " +  
                                     a + " and b = " + b);         
       
} 
		

	}


