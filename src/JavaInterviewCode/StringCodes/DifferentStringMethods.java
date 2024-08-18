package JavaInterviewCode.StringCodes;

public class DifferentStringMethods {
	String myName = "Aditya";
	String surName = new String("Barbadikar");
	String[] visitedCity = {"Toronto","Montrial"};
	String[] visitedCountry = {"canada","Germany"};
	int a = 10;

	public static void main(String[] args) {
		DifferentStringMethods d = new DifferentStringMethods();
		char[] chars = d.myName.toCharArray();//String to char array
		d.myName.equals(d.surName);//equals compare content
		d.myName.compareTo(d.surName);//comparison based on unicode value
		d.myName.compareToIgnoreCase(d.surName);
		d.myName.charAt(2);// returns char at a position
		d.myName.toLowerCase();//all lower value
		d.myName.replaceAll("[@#$%%]", "");//[a-zA-Z0-9]
		

	}

}
