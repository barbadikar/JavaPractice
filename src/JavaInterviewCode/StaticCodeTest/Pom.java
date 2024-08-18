package JavaInterviewCode.StaticCodeTest;

public class Pom {
	
	public static String name = "Aditya";
	public static int age = 30;
	public static int standard = 11;
	public static final int marks = 60;
	public String surname = "Barbadikar";
	
	public void jayDetails() {
		 String name = "Jay";
		 int age = 30;
		 int standard = 11;
		 final int marks = 60;
		 System.out.println(name+age+standard+marks);
		 System.out.println(Pom.age);
		 Pom.name = "Adii";
		 System.out.println(Pom.name);
		
	}
	
	

	public static void main(String[] args) {
		name = "Adi";
		System.out.println(name+age+standard+marks);
		Pom p = new Pom();
		p.jayDetails();
		System.out.println(p.surname);
		
		

	}

}
