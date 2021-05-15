package Assignment_2;

public abstract class A2Q6 {

	abstract void persist();
	}
	class Database extends A2Q6{
		
		@Override
		void persist() {
			System.out.println("This is Database persistance");
		}
	}
	class File extends A2Q6{
		@Override
		void persist() {
			System.out.println("This is File persistance");
		}
		
	}
	class Pers{
		
		public static void main(String[] args) {
			A2Q6 a = new Database();
			A2Q6 b = new File();
			a.persist();
			b.persist();
			
			
		}

}
