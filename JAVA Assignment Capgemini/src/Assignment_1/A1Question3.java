package Assignment_1;

import java.util.Scanner;

public class A1Question3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Principle amount in INR");
		float P= scan.nextFloat();
		System.out.println("Enter the rate per year");
		int R= scan.nextInt();
		System.out.println("Enter Time in Years");
		int T= scan.nextInt();
		
		float A = P+(P*R*T)/100f;
		
		System.out.println("The Amount after Simple Interest is"+ A + "per year");
		
		float temp=P;
		float B=temp;
		int i=0;
		
		while(i<T){
			B=B+ ((temp*R*T)/100f);
			temp=B;
			i++;
			
		}
		
		System.out.println("The Amount after Compound Interest is"+ B + "per year");
		

	}

}
