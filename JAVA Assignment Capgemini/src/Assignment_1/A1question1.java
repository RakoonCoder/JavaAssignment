package Assignment_1;

import java.util.Scanner;

public class A1question1 {

	public static void main(String[] args) {
		int temp;
		int sum=0;
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a number");
		
		int n= scan.nextInt();
		temp=n;
		
		while(n>0){
		int c= n%10;
		int d= c*c*c;
		sum=sum+d;
		n=n/10;
		}
		if(sum==temp){
			System.out.println("It is an armstrong number");
		}
		else{
			System.out.println("Not an armstrong number");
		}

	}

}
