package Assignment_3;

public class Person implements Comparable<Person> {
	int weight;
	int height;
	String name;
	public Person(int weight, int height, String name) {
		super();
		this.weight = weight;
		this.height = height;
		this.name = name;
	}
	
	public int getWeight() {
		return weight;
	}
	public int getHeight() {
		return height;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Person [weight=" + weight + ", height=" + height + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Person p) {
		if(this.weight==p.getWeight()){
			if(this.height>p.getHeight())
				return 1;
			else
				return -1;
		}
		
		
		else if(this.weight>p.getWeight())
			return 1;
		else
			return -1;
		
	}
	
	
	}


