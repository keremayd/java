
public abstract class Academician extends Person {

	protected int salary;
	protected int wage=1400;
	private Vehicle vehicleObj;

	
	public Academician(String name, String surname, int age, boolean licence, int salary, Vehicle vehicle) {
		super(name, surname, age, licence);
		setSalary(salary);
		setVehicleObj(vehicle);
	}


	public int getSalary() {

		return salary;
	}


	public abstract void setSalary(int salary); //1tane maas yok birden fazla maas var degisken bir yapisi var.

	@Override
	public String toString() {
		
		// TODO Auto-generated method stub
		return super.toString()+" Salary :"+salary;
	}


	public Vehicle getVehicleObj() {
		return vehicleObj;
	}


	public abstract void setVehicleObj(Vehicle vehicleObj);
	
	
	
	
}
