/*STEP 1: START
STEP 2: DEFINE str1 = "Brag", str2 = "Grab".
STEP 3: CONVERT str1, str2 to lower-case.
STEP 4: IF length of str1, str2 are not equal then PRINT "Not Anagram"
else go to Step 5
STEP 5: CONVERT str1, str2 to character arrays.
STEP 6: SORT the arrays.
STEP 7: COMPARE the arrays, IF equal then PRINT "Anagram"
else
PRINT "Not Anagram"
STEP 8: END*/


package StringDemoexample;

import java.util.Arrays;

public class AnagramExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		        String str1="Brag";  
		        String str2="Grab";  
		  
		        //Converting both the string to lower case.  
		        str1 = str1.toLowerCase();  
		        str2 = str2.toLowerCase();  
		  
		        //Checking for the length of strings  
		        if (str1.length() != str2.length()) {  
		            System.out.println("Both the strings are not anagram");  
		        }  
		        else {  
		            //Converting both the arrays to character array  
		            char[] string1 = str1.toCharArray();  
		            char[] string2 = str2.toCharArray();  
		  
		            //Sorting the arrays using in-built function sort ()  
		            Arrays.sort(string1);  
		            Arrays.sort(string2);  
		  
		            //Comparing both the arrays using in-built function equals ()  
		            if(Arrays.equals(string1, string2)) //== true) 
		            {  
		                System.out.println("Both the strings are anagram");  
		            }  
		            else {  
		                System.out.println("Both the strings are not anagram");  
		            }  
		          
		    }  
		}   

	}


