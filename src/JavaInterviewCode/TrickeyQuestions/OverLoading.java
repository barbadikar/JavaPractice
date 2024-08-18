package JavaInterviewCode.TrickeyQuestions;
// If C doen't have m1 c.m1() is not allowed
// If C has m1 as below D method will be called
// If C has m1 but is static then method overloading is not allowed it's method hiding and A method is called
//only one method static is not allowed

class C{
	void m1() {
		System.out.println("I am in c");
	}
	
} class D extends C{
	void m1() {
		System.out.println("I am in D");
	}
	
}
public class OverLoading {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new D();
		c.m1();	
		

	}

}
