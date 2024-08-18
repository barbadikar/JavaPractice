package JavaInterviewCode.TrickeyQuestions;

//Interface always has 
//variable public final and it's value cannot be reassigned

interface TestInterface{
	int i =10;
}

public class InterfacevaraibleFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInterface.i=12;
		System.out.println(TestInterface.i);

	}

}
