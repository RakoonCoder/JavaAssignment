package Assignment_3;

import java.util.ArrayList;
import java.util.List;

public class Q7 {
	List<Parked_CarOwner_Details> l= new ArrayList<>();
	void add_new_Car(String ownerName, String carModel, int carNO, long ownerMobileNo,
			String ownerAddress){
		
		Parked_CarOwner_Details p = new Parked_CarOwner_Details("Ria", "abc", 101, 8876,"Guwahati"  );
		
		l.add(p);
	}
	void removeCar(Parked_CarOwner_Details p){
		l.remove(p);
		
	}
	int get_ParkedCar_location(Parked_CarOwner_Details p){
		return 101;
		
	}

	public static void main(String[] args) {
		List<Parked_CarOwner_Details> l= new ArrayList<>();
		
		Parked_CarOwner_Details p1 = new Parked_CarOwner_Details("Ria", "abc", 101, 8876,"Guwahati"  );
		Parked_CarOwner_Details p2 = new Parked_CarOwner_Details("Neha", "def", 102, 8877,"Guwahati"  );
		Parked_CarOwner_Details p3 = new Parked_CarOwner_Details("Ritika", "ghi", 103, 8878,"Guwahati");
		
		l.add(p1);
		l.add(p2);
		l.add(p3);
		
		System.out.println();
		l.remove(p1);
		System.out.println(l);
		
		
		
		
	
	}	
	
}
