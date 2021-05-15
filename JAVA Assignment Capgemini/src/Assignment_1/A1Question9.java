package Assignment_1;

import java.util.Scanner;

public class A1Question9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int array[][]= new int[3][3];
		
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
		       System.out.println("Enter marks for Student "+ i + "Subject "+ j);
		       array[i][j]= scan.nextInt();
			}
		}
		
		
		for(int i=0; i<3; i++){
		 int totalScoreInAllSub= 0;
		 int avgScoreInAllSub=0;
		  for(int j=0;j<3;j++){
			totalScoreInAllSub=totalScoreInAllSub+array[i][j];
		}
		  avgScoreInAllSub=totalScoreInAllSub/3;
		  System.out.println("total score of student "+i + "is" + totalScoreInAllSub);
		  System.out.println("avg score of student "+i + "is" + avgScoreInAllSub);
	  }
		for(int j=0; j<3; j++){
			 int totalScoreOfAllStudent= 0;
			 int avgScoreOfAllStudent=0;
			  for(int i=0;i<3;i++){
				totalScoreOfAllStudent=totalScoreOfAllStudent+array[i][j];
			}
			  avgScoreOfAllStudent=totalScoreOfAllStudent/3;
			  System.out.println("total score of subject "+j + "is" + totalScoreOfAllStudent);
			  System.out.println("avg score of subject "+j + "is" + avgScoreOfAllStudent);
		  }
	}

}
