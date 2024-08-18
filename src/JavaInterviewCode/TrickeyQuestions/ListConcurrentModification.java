package JavaInterviewCode.TrickeyQuestions;

import java.util.ArrayList;
import java.util.List;

public class ListConcurrentModification {
	public static void main(String[] args) {
    	List<String> list = new ArrayList<>();
    	list.add("One");
    	list.add("Two");
    	list.add("Three");
    	
    	
     	for (String item : list) {
        	if (item.equals("Two")) {
            	list.remove(item);
        	}
    	}
     	System.out.println(list);
	}

}
//list.get(0);
//list.set(0,"A")
//list.add(!) can add wildchar
//list.remove()
//Collections.addAll(list,"a","b","c","!") you call directly call collections
