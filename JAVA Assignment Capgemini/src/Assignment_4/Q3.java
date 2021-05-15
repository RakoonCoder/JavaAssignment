package Assignment_4;

public class Q3 {

	public static void main(String[] args) {
		    java.util.function.Predicate<String> pfunc= p->p.length()>5;
		    System.out.println("Predicate Outputs:");
		    System.out.println(pfunc.test("abc"));
		    System.out.println(pfunc.test("def"));

	}
	@FunctionalInterface
	interface Predicate<String>{
	    boolean test(String p);

}
}