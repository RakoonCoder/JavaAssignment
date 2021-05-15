package Assignment_1;

import java.util.Scanner;

public class A1Question6 {

	public static void main(String[] args) {
		String user_name= new String();
		user_name= "Anuragini";
		int password = 1234;
		
		Scanner scan = new Scanner(System.in);
		
		int i=0;
		
		while(i<3){
		
			System.out.println("Enter username");
			String uname= scan.next();
			
			System.out.println("Enter password");
			int pw = scan.nextInt();
			
			System.out.println(uname + pw);
			
			
		if(uname.equals(user_name) && pw == password ){
			System.out.println("Welcome "+ user_name);
		}
		else{
			System.out.println("Wrong username or password. Try again");
		}
		i++;
	   }
		
		System.out.println("Contact Admin");
		scan.close();
   }
}
