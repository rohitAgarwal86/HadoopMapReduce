package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Maps {

	private static Map<Integer, String> test;

	public static void main(String[] args) {
		test = new HashMap<Integer, String>();
		test.put(1, "rohit");
		test.put(2, "madhuri");

		Iterator<Entry<Integer, String>> it = test.entrySet().iterator();

		while (it.hasNext()) {
			Entry<Integer, String> map = it.next();
			System.out.println("Id is " + map.getKey() + "--> the Value is " + map.getValue());
		}

	}

}
