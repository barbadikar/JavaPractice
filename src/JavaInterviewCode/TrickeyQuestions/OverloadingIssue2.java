package JavaInterviewCode.TrickeyQuestions;

public class OverloadingIssue2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		OverloadingIssue2 d = new OverloadingIssue2();
		d.m1(20);
		

	}
	void m1(int i) {}//method already defined no overloading will happen
	Int m1(int j) {}//method signature is same
	

}
