package Assignment_1;

import java.util.Scanner;

public class A1Question7 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int array[]= new int[15];
		for(int i=0; i<15; i++){
			System.out.println("Enter the"+ i+"th element");
			array[i]= scan.nextInt();
		}
		
		System.out.println("Enter number to be searched");
		int num= scan.nextInt();
		
		for(int i=0; i<15; i++){
			if(array[i]==num){
				System.out.println("Element present at position" + i);
			}
		}
	
		
		scan.close();
	}
}
