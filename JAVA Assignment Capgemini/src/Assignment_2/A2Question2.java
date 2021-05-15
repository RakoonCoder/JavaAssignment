package Assignment_2;

public class A2Question2 {

	public static void main(String[] args) {
		Manager m1 = new Manager(50000, 5000);
		Manager m2 = new Manager(50000, 12000);
		Labour l1 = new Labour(10000, 5000);
		
		int totalSalary=  m1.getSalary()+m2.getSalary()+l1.getSalary();
		System.out.println(totalSalary);

	}

}
