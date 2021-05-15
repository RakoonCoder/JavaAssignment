package Assignment_2;

public class Manager extends Employee{
	int incentive;
	
	Manager(int salary,int incentive){
		this.salary=salary;
		this.incentive=incentive;
	}
	
	public int getSalary(){
		int a= salary+ incentive;
		return a;
	}

}
