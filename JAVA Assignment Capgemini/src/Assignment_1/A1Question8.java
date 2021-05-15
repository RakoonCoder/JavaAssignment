package Assignment_1;

import java.util.Scanner;

public class A1Question8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n= scan.nextInt();
		int array[]= new int[n];
		for(int i=0; i<n; i++){
			System.out.println("Enter the"+ i+"th element");
			array[i]= scan.nextInt();
		}
		for(int i=0; i<(n-1); i++){
			for(int j=0; j<n-1-i; j++){
				if(array[j]>array[j+1]){
					int temp= array[j];
					array[j]=array[j+1];
					array[j+1]= temp;
				}
			}
		}
		
		System.out.println("Sorted array is");
		
		for(int i= 0; i<5; i++){
			System.out.println(array[i]);
		}

	}

}
