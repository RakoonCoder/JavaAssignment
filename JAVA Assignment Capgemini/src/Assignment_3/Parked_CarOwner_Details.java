package Assignment_3;

public class Parked_CarOwner_Details {
	String ownerName;
	String carModel;
	int carNO;
	long ownerMobileNo;
	String ownerAddress;
	
	
	public Parked_CarOwner_Details(String ownerName, String carModel, int carNO, long ownerMobileNo,
			String ownerAddress) {
		super();
		this.ownerName = ownerName;
		this.carModel = carModel;
		this.carNO = carNO;
		this.ownerMobileNo = ownerMobileNo;
		this.ownerAddress = ownerAddress;
	}
	public String getOwnerName() {
		return ownerName;
	}
	
	public String getCarModel() {
		return carModel;
	}
	public int getCarNO() {
		return carNO;
	}
	
	public long getOwnerMobileNo() {
		return ownerMobileNo;
	}
	
	public String getOwnerAddress() {
		return ownerAddress;
	}

}
