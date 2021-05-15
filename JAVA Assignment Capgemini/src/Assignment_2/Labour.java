package Assignment_2;

public class Labour extends Employee {
	int overtime;
	
	Labour(int salary, int overtime){
		this.salary=salary;
		this.overtime= overtime;
	}
	public int getSalary(){
		int a= salary+ overtime;
		return a;
	}

}
