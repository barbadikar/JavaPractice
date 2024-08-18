package JavaInterviewCode.TrickeyQuestions;
class A{
void m1(int X) {
		System.out.println("In am in A");
	}
}

class B extends A{
	void m1(int X) {
		System.out.println("In am in B");
	}
}

public class ExtendParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new B();
		obj.m1(10);//parent cannot find symbol as it's cannot see method in it's child

	}

}
