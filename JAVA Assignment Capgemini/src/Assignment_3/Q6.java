package Assignment_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Q6 {
	@SuppressWarnings("resource")
	static void userLogin(String name) {
		Scanner sc= new Scanner(System.in);
		if(name.equalsIgnoreCase("Abhi")||name.equalsIgnoreCase("rahul")||name.equalsIgnoreCase("Neha")||name.equalsIgnoreCase("Risha")) {
		System.out.println(name+ " logged in");
		System.out.println("Send a message");
		String m= sc.nextLine();
		System.out.println("Message by "+name+": "+m);
		}
		}
		static void userLogout(String name1) {
		if(name1.equalsIgnoreCase("Abhi")||name1.equalsIgnoreCase("rahul")||name1.equalsIgnoreCase("Neha")||name1.equalsIgnoreCase("Risha")) {
		System.out.println(name1+ " logged out");
		}
		}
		@SuppressWarnings("resource")
		public static void main(String[] args) {
		
		ArrayList<String> user= new ArrayList<String>();

		user.add("Abhi");
		user.add("rahul");
		user.add("Neha");
		user.add("Risha");
		Scanner s= new Scanner(System.in);
		System.out.println("Enter username to login");
		String n= s.nextLine();
		userLogin(n);
		System.out.println("Users in Chatroom:");
		for (String str : user)
		            System.out.print(str + " ");
		System.out.println("\nEnter username to logout");
		String n1= s.nextLine();
		userLogout(n1);
		user.remove(n1);
		System.out.println("Users in Chatroom:");
		for (String str1 : user)
		            System.out.print(str1 + " ");
		}

}
