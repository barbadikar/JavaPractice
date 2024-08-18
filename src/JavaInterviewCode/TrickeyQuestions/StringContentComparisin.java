package JavaInterviewCode.TrickeyQuestions;

public class StringContentComparisin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder(5);//it has capacity 5 but content is ""
		String s = "";
		
		if(sb.equals(s)) {	//sb no equals method overiden and has same "" content but their objects reference are different hence goes to else
			System.out.println("Match 1");
		}else if(sb.toString().equals(s.toString())) {
			System.out.println("Match 2");
		}else {
			System.out.println("Match 3");

}
		
	
		
			//sb can be used to reverse string function by .reverse() method
			//sb no equals method 
			//so it uses equals method of object class
			//in object class equals method compares object reference
			//in string class equal method compares values
			//Hence same "" content but their objects reference are different hence goes to else

	}
}
