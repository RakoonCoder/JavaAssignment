package Assignment_3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Q2 {
	public static void main(String[] args){
		Set<Integer> a= new HashSet<>();
		a.add(6);
		a.add(4);
		a.add(65);
		a.add(1);
		
		System.out.println(a);
		Set<Integer> b= new LinkedHashSet<>();
		b.add(6);
		b.add(4);
		b.add(65);
		b.add(1);
		
		System.out.println(b);
	}

}
