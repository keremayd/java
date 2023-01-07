public abstract class  Vehicle {
	private String brand, model;
	private int numberofWheel;
	private int enginePower;
	protected String fuelType;
	
	
	public Vehicle(String brand, String model, int numberofWheel, String fuelType, int enginePower) {
		setBrand(brand);
		setModel(model);
		setEnginePower(enginePower);
		setFuelType(fuelType);
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getNumberofWheel() {
		return numberofWheel;
	}


	public void setNumberofWheel(int numberofWheel) {
		this.numberofWheel = numberofWheel>0?numberofWheel:0;
	}


	public int getEnginePower() {
		return enginePower;
	}


	public void setEnginePower(int enginePower) {
		this.enginePower = enginePower;
	}


	public String getFuelType() {
		return fuelType;
	}


	public abstract void setFuelType(String fuelType);
	
	public String toString() {
		return "Brand: "+getBrand()+ "model "+getModel()+"Engine power "+ getEnginePower()+ "Fuel type "+ getFuelType();
	}
}
