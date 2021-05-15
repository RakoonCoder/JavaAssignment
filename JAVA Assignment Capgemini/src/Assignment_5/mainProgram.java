package Assignment_5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class mainProgram {
	public static void main(String[] args) {
		List<Fruit> f = Arrays.asList(

				new Fruit("Mango", 120, 60, "Green"),
				new Fruit("Apple", 55, 100, "Red"),
				new Fruit("Banana", 200, 55, "Yellow"), 
				new Fruit("Orange", 30, 150, "Orange"));

		List<News> n = Arrays.asList(

				new News(101, "Ravi", "Nisha", " This is News 1"),
				new News(102, "Nikita", "Priya", "This is News 2"),
				new News(103, "Rohit", "Rohit", "This is News 3 "),
				new News(104, "Priya", "Nikita", "This is News 4"),
				new News(104, "Nisha", "Ravi", "This is News 5"));
		List<Trader> Trade = Arrays.asList(

				new Trader("Yuddisthir", "Bangalore"), 
				new Trader("Bhim", "Pune"), 
				new Trader("Arjun", "Delhi"),
				new Trader("Nakul", "Indore"), 
				new Trader("Sahadev", "Delhi")); 
				
		List<Transaction> Tran = Arrays.asList(

				new Transaction(new Trader("Chichya", "Pune"), 2012,42300 ),
				new Transaction(new Trader("Chintu", "Mumbai"), 2014, 67000),
				new Transaction(new Trader("Akash", "Delhi"), 2019, 30000),
				new Transaction(new Trader("Amol", "Pune"), 2014, 21000),
				new Transaction(new Trader("Rohan", "Delhi"), 2016, 20000));
				

		
		f.stream().filter(t -> (t.calories < 100)).collect(Collectors.toList())
				.forEach(t -> System.out.println(t));

		
		System.out.println("Sort according to color");
		f.stream().sorted((p1, p2) -> p1.color.compareTo(p2.color)).forEach(System.out::println);

		
		System.out.println("Sort Red color fruits sorted withprice in ascending");
		f.stream().filter(t -> t.color.equals("Red")).forEach(t -> System.out.println(t));

		// Find out the newsId which has received maximum comments.
		System.out.println("newsId which has received maximum comments");
		int p = n.stream().min((p1, p2) -> {
			return (int) p1.getNewsID() + p2.getNewsID();
		}).get().getNewsID();
		System.out.println(p);

		// Find out how many times the word 'budget' arrived in user comments all news.
		System.out.println("the word 'budget' arrived in user comments ");

		n.stream().filter(t -> t.comment.contains("budget")).forEach(t -> System.out.println(t));

		// Find out which user has posted maximum comments.
		System.out.println("which user has posted maximum comments");
		String N = n.stream().max((p1, p2) -> {
			return (int) p1.getCommentbyUser().compareTo(p2.getCommentbyUser());
		}).get().getCommentbyUser();

		System.out.println(N);

		// Display commentByUser wise number of comments
		System.out.println("commentByUser wise number of comments");
		n.stream().sorted((p1, p2) -> p1.getCommentbyUser().compareTo(p2.getCommentbyUser()))
				.collect(Collectors.toList())
				.forEach(t -> System.out.println(t.getCommentbyUser() + "=" + t.comment));

		// Find all transactions in the year 2011 and sort them by value (small to
		// high).
		System.out.println("transactions in the year 2011 and sort them by value (small to high).");
		Tran.stream().filter(t -> (t.getYear() == (2014)))
				.forEach(t -> System.out.println("year=" + t.year + " value=" + t.value));

		// What are all the unique cities where the traders work?
		System.out.println("all the unique cities where the traders work");

		Trade.stream()

				.forEach(t -> System.out.println("Cities=" + t.city));

		// Find all traders from Pune and sort them by name.
		System.out.println("traders from Pune and sort them by name");
		Trade.stream().filter(t -> t.city.equals("Pune"))
				.sorted((p1, p2) -> p1.name.compareTo(p2.name))
				.forEach(t -> System.out.println(t.city + "=" + t.name));

		// Return a string of all traders’ names sorted alphabetically.
		System.out.println("string of all traders’ names sorted alphabetically");
		Trade.stream().sorted((p1, p2) -> p1.name.compareTo(p2.name))
				.forEach(t -> System.out.println(t.name));

		// Are any traders based in Indore?
		System.out.println("any traders based in Indore?");
		boolean a = Trade.stream().anyMatch(t -> t.name.equals("indore"));
		System.out.println(a);

		// Print all transactions’ values from the traders living in Delhi.
		System.out.println("all transactions’ values from the traders living in Delhi");

		Tran.stream().filter(t -> t.trader.city.equals("Delhi"))
				.forEach(t -> System.out.println(t.trader.city + "=" + t.value));

		// What’s the highest value of all the transactions?
		System.out.println("highest value of all the transactions");

		int b = Tran.stream().max((p1, p2) -> p1.value - p2.value).get().getValue();

		System.out.println(b);
		// Find the transaction with the smallest value
		System.out.println("transaction with the smallest value");
		int s = Tran.stream().min((p1, p2) -> p1.value - p2.value).get().getValue();

		System.out.println(s);

		
	}

}
