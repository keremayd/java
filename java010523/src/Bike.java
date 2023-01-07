public class Bike extends Vehicle {
	public Bike(String brand, String model, int numberofWheel, String fuelType, int enginePower) {
		super(brand, model, numberofWheel, fuelType, enginePower);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setFuelType(String fuelType) {
		super.fuelType = null;
		
	}
}
