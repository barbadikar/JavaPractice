package JavaInterviewCode.TrickeyQuestions;

public class OverloadingIssue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A();
		a.m1(null);//ambiguos method call

	}
	class A{
		void m1(String obj) {};
		void m1(Object obj) {};
		void m1(Integer obj) {}
		
	}

}
