package Assignment_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q5 {

	public static void main(String[] args) {
		StringBuilder string = new StringBuilder();
		List<String> l1= new ArrayList<>(Arrays.asList("AAA","BBB","CCC","DDD","EEE","FFF"));
		l1.forEach(word -> string.append(word.charAt(0)));
		System.out.println(string);
	}

}
