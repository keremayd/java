import java.util.Random;

public class Motorcyle extends Vehicle {

	public Motorcyle(String brand, String model, int numberofWheel, String fuelType, int enginePower) {
		super(brand, model, numberofWheel, fuelType, enginePower);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setFuelType(String fuelType) {
		String[] fuelTypes= {"Electric","Gasoline"};
		Random r=new Random();
		super.fuelType = fuelTypes[r.nextInt(2)];
		
	}

}
