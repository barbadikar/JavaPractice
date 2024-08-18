package JavaInterviewCode.TrickeyQuestions;

import java.util.HashMap;
import java.util.Map;

public class HashMapLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> hashmap = new HashMap<>();
		hashmap.put("abc", 2000);
		hashmap.put("pqr", 3000);
		hashmap.put("xyz", 4000);
		hashmap.put("pqr", 5000);
		
		System.out.println(hashmap.size());//size will be 3 as "pqr" gets replaced
		// Hashmap has unique key value pair
		

	}

}
