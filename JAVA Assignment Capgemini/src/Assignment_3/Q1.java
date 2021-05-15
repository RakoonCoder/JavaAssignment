package Assignment_3;

import java.util.Set;
import java.util.TreeSet;

public class Q1 {
	

	public static void main(String[] args){
		Set<Person> people= new TreeSet<Person>();
		people.add(new Person(50,167,"Navin"));
		people.add(new Person(60,182,"Ashok"));
		people.add(new Person(57,155,"Rohan"));
		people.add(new Person(57,156,"Rahul"));
		
		
		
		System.out.println(people);
	}


}
