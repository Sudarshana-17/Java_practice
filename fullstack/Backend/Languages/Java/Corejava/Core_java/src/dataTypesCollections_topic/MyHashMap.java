package dataTypesCollections_topic;

import java.util.ArrayList;
import java.util.HashMap;

public class MyHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap data=new HashMap();
		data.put("a", "apple");
		data.put("b", "ball");
		data.put("d", "cat");
		System.out.println(data);
		
		ArrayList all=new ArrayList();
		all.add(data);
		all.add(data);
		System.out.println(all);
		

	}

}
