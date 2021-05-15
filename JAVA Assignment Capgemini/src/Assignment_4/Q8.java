package Assignment_4;

import java.util.ArrayList;
import java.util.List;

public class Q8 {
	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		new Thread(list1);
	}

}
