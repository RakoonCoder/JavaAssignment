package Assignment_3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;



public class Q3 {

	public static void main(String[] args) {
		List<Integer> l= new ArrayList<>();
		l.add(30);
		l.add(4);
		l.add(23);
		l.add(10);
		
		ListIterator<Integer> i= l.listIterator(l.size());
		
	    
		while(i.hasPrevious()){
			System.out.println(i.previous());
		}
		
	

	}

}
