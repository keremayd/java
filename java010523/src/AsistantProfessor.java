public class AsistantProfessor extends Academician {

	public AsistantProfessor(String name, String surname, int age, boolean licence, int salary, Vehicle vehicleObj) {
		super(name, surname, age, licence, salary,vehicleObj);
		
	}

	@Override
	public void setSalary(int salary) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVehicleObj(Vehicle vehicleObj) {
		if(vehicleObj instanceof Scooter) {
			System.out.println("");
		}
		else if(vehicleObj instanceof Bike) {
			System.out.println(getClass()+" "+getName()+ " "+getSurname()+" Dr. Ogretim uyesi oldugunda bisiklet alabilirsin");
		}
		else if(vehicleObj instanceof Motorcyle) {
			System.out.println(getClass()+" "+getName()+ " "+getSurname()+" Doç. Ogretim uyesi oldugunda motor alabilirsin");
		}
		else if(vehicleObj instanceof Car) {
			System.out.println(getClass()+" "+getName()+ " "+getSurname()+" Prof. Ogretim uyesi oldugunda araba alabilirsin");
		}
		
	}

}
