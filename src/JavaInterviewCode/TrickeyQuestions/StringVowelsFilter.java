package JavaInterviewCode.TrickeyQuestions;

import java.io.IOException;

public class StringVowelsFilter {
	 public static void main(String[] args)
		        throws IOException
		    {
		        String str = "My Name is Aditya @#@## Barbadikar @--";
		        str = str.replaceAll("[-@#$%]", "");//replace call
		       
		        System.out.println("The value is :"+str.toString());
		        
		        str = str.toLowerCase();
		        int count = 0;
		 
		        for (int i = 0; i < str.length(); i++) {
		            // check if char[i] is vowel
		            if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
		                || str.charAt(i) == 'i'
		                || str.charAt(i) == 'o'
		                || str.charAt(i) == 'u') {
		                // count increments if there is vowel in
		                // char[i]
		                count++;
		            }
		        }
		 
		        // display total count of vowels in string
		        System.out.println(
		            "Total no of vowels in string are: " + count);
		    }

}
