package JavaInterviewCode.TrickeyQuestions;

public class StringConcat {
	public static void main(String[] args) {
		String str1 = "A";//A
		str1 = str1.concat("B");//AB
		
		String str2 = "C";//C
		str1 = str1.concat(str2);//ABC
		
		str1.replace('C', 'D');//ABD but not assigned to str1 so eligible for garbage collector
		str1 = str1.concat(str2);//ABCC
		
		System.out.println(str1);
		
		
	}

}
