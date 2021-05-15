package Assignment_4;

import java.util.*;

public class Q2 {

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		System.out.println("Enter the order price");
		Scanner scan =new Scanner(System.in);
		int  m=scan.nextInt();
		
		if(m>10000) {
		OrdersStatus a=()->System.out.println("COMPLETED");
		a.Status();}
		else {
			OrdersStatus b=()->System.out.println("ACCEPTED");
			b.Status();
	}
		}
}
interface OrdersStatus
{
void Status();	

}
