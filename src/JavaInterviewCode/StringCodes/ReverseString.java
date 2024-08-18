package JavaInterviewCode.StringCodes;
//Pallindrome
public class ReverseString {
	public static void main(String[] args) {
		ReverseString w1 = new ReverseString();
		w1.withoutBuilder();
		
		ReverseString w2 = new ReverseString();
		w2.withoutBuilder();

	}
	public void withoutBuilder() {
		String str = "Saket Saurav";
        char[] chars = str.toCharArray();  // converted to character array and printed in reverse order
        for(int i= chars.length-1; i>=0; i--) {
            System.out.print(chars[i]);
        }
	}
	
	public void withBuilder() {
		String str = "Automation";
        StringBuilder str2 = new StringBuilder();
        str2.append(str);
        str2 = str2.reverse();     // used string builder to reverse
       System.out.println(str2);
        
	}

}
