package JavaInterviewCode.TrickeyQuestions;

public class StringComparision {
public static void main(String[] args) {
	String s1 = "abc";
	char[] arr= {'a','b','c'};
	String s2 = new String(arr);//new object created here
	System.out.println(s1.equals(s2));//true - content compare
	System.out.println(s1==s2);//false - object compare // if s2 would have been s2="abc" then this will give true
	
	/////////////////////////////
	String a = "Test";
	String b = "Test";
	
	String c = new String("Test");
	String d = new String("Test");
	
	System.out.println(a.equals(b));//true
	System.out.println(a.equals(c));//true
	System.out.println(a==b);//true
	System.out.println(a==c);//false
	System.out.println(d.equals(c));//true
	System.out.println(c==d);//false
	
}
}
