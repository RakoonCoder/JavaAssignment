package Assignment_4;

import java.util.ArrayList;
import java.util.List;

public class Q6 {

	public static void main(String[] args) {
		List<String> l=new ArrayList<>();
		l.add("shreya");
		l.add("riya");
		l.add("rohit");
		l.add("nishant");
		l.add("ashim");
		l.add("mahesh");
		l.replaceAll(n->n.toUpperCase());
		l.forEach(System.out::println);

	}

}
