package Assignment_4;

public class Predicate {

	public static void main(String[] args) {
		// Creating predicate
        Predicate<Integer> lesserthan = i -> (i < 20); 
  
        // Calling Predicate method
        System.out.println(lesserthan.test(100));

	}

}
