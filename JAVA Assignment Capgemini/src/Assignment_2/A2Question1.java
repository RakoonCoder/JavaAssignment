package Assignment_2;

public final class A2Question1 {
	private int a;
	private A2Question1(int a){
		this.a= a;
	}
	
	void getNumber(){
		System.out.println(a);
		
	}
	
 public static void main(String[]args){
	A2Question1 a2= new A2Question1(5);
	a2.getNumber();
	
 }

}
