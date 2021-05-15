package Assignment_1;

import java.util.Scanner;

public class A1Question4 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter marks in subject 1");
		int sub1= scan.nextInt();
		
		System.out.println("Enter marks in subject 2");
		int sub2= scan.nextInt();
		
		System.out.println("Enter marks in subject 3");
		int sub3= scan.nextInt();
		
		if(sub1>=60){
			System.out.println("You passed in Subject 1");
		}
		else{
			System.out.println("You failed in Subject 1");
		}
		
		if(sub2>=60){
			System.out.println("You passed in Subject 2");
		}
		else{
			System.out.println("You failed in Subject 2");
		}
		
		if(sub3>=60){
			System.out.println("You passed in Subject 3");
		}
		else{
			System.out.println("You failed in Subject 3");
		}

	}

}
