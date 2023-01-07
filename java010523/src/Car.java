import java.util.Random;

public class Car extends Vehicle{

	public Car(String brand, String model, int numberofWheel, String fuelType, int enginePower) {
		super(brand, model, numberofWheel, fuelType, enginePower);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setFuelType(String fuelType) {
		String[] fuelTypes= {"LPG","Diesel","Gasoline"};
		Random r=new Random();
		super.fuelType = fuelTypes[r.nextInt(3)];
		
	}

}
