package Assignment_4;

import java.util.ArrayList;

public class Q4 {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		
		a.add("Richa");
		a.add("Shriyanjana");
		a.add("Ankesh");
		a.add("Rohit");
		a.add("Nikita");
		a.add("Reese");
		
		System.out.println(a);
		
		a.removeIf(t->(t.length()%2==1));
		System.out.println(a);
		
		 a.stream()
		.filter(p->(p.length()%2==1))
		.forEach(p->System.out.println("\n"+p));


	}

}
