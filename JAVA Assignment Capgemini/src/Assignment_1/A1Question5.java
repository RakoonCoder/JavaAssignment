package Assignment_1;

import java.util.Scanner;

public class A1Question5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your Salary per annum");
		int salary= scan.nextInt();
		
		if(salary>=0 && salary<=180000){
			System.out.println("Tax payable=Nil");
		}
		else if(salary>180000 && salary<=300000){
			int tax= (10* salary)/100;
			System.out.println("Tax payable="+ tax);
			
		}
		else if(salary>300000 && salary<=500000){
			int tax= (20* salary)/100;
			System.out.println("Tax payable="+ tax);

			
		}
		else if(salary>500000 && salary<=1000000){
			int tax= (30* salary)/100;
			System.out.println("Tax payable="+ tax);

		}
		else{
			System.out.println("You have high tax rate");
		}

	}

}
