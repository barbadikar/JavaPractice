package JavaInterviewCode.HashMapCode;
import java.util.HashMap;

public class TestingHashMap {
	public static void main(String[] args) {
		HashMap<String,String> data = new HashMap<String, String>();
		data.put("Name", "Aditya");
		data.put("City", "Toronto");
		data.put("Job", "IT");
		data.put("country", "Canada");
		
		for(String key:data.keySet()) {
			String val = data.get(key);
			System.out.println("The value of :"+val);
			
		}
		
		
	}

}
