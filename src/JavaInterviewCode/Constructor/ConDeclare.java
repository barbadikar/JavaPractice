package JavaInterviewCode.Constructor;

public class ConDeclare {
	String name;
	String surname;
	
	public ConDeclare(String name,String surname) {
		System.out.println("I am in con");
		this.name = name;
		this.surname = surname;
		
	}
	public void printname() {
		System.out.println("My name is :"+name+surname);
	}

	public static void main(String[] args) {
		System.out.println("I am in main");
		// TODO Auto-generated method stub
		ConDeclare c = new ConDeclare("Adi", "Bar");
		c.printname();

	}

}
