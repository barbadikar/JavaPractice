package JavaInterviewCode.TrickeyQuestions;

public class RecursiveCode {
	public static int sum(int n) {
    	if (n <= 0) {
        	return sum(n + 1);//as it returns sum again and again
    	}
    	return n + sum(n - 1);
	}
 	public static void main(String[] args) {
    	System.out.println(sum(-5));
	}

}
