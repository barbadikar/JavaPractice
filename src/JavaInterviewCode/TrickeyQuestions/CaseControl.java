package JavaInterviewCode.TrickeyQuestions;

public class CaseControl {
	public static void main(String[] args) {
    	int dayOfWeek = 3;
    	String day;
     	switch (dayOfWeek) {
        	case 1:
            	day = "Monday";
            	break;
        	case 2:
            	day = "Tuesday";
            	break;
        	case 3:
            	day = "Wednesday";
            	break;
        	default:
            	day = "Unknown";
    	}
     	System.out.println(day);//wednesday
	}
}
