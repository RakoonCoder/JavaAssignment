package Assignment_1;

public class A1Queston2 {

	public static void main(String[] args) {
	  for(int i=100; i<=999; i++){
		int temp;
		int sum=0;
		
		int n= i;
		temp=n;
		
		while(n>0){
		int c= n%10;
		int d= c*c*c;
		sum=sum+d;
		n=n/10;
		}
		if(sum==temp){
			System.out.println(temp);
		}
	}

	

	}

}
