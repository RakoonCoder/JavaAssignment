package Assignment_4;

import java.util.HashMap;
import java.util.Map;

public class Ex {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("riya", 101);
		map.put("anita",201);
		map.put("siddhu",301);
		
		StringBuilder sb = new StringBuilder();
		map.entrySet().forEach(n -> sb.append(n.getKey()).append(n.getValue()));
		System.out.println(sb.toString());

	}

}
