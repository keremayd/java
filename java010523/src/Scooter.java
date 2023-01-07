import java.util.Random;

public class Scooter extends Vehicle{

	public Scooter(String brand, String model, int numberofWheel, String fuelType, int enginePower) {
		super(brand, model, numberofWheel, fuelType, enginePower);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setFuelType(String fuelType) {
		super.fuelType = "Electric";
		
	}

}
