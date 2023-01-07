
public class ResearchAsistant extends Academician {

	public ResearchAsistant(String name, String surname, int age, boolean licence, int salary,Vehicle vehicleObj) {
		super(name, surname, age, licence, salary, vehicleObj);
		
	}

	@Override
	public void setSalary(int salary) {
		
		super.salary=(int) (super.wage*1.5);

	}

	@Override
	public void setVehicleObj(Vehicle vehicleObj) {
		if(vehicleObj instanceof Scooter) {
			System.out.println("");
		}
		else if(vehicleObj instanceof Bike) {
			System.out.println(getClass()+" "+getName()+ " "+getSurname()+"Dr. Ogretim uyesi oldugunda alabilirsin");
		}
		else if(vehicleObj instanceof Motorcyle) {
			System.out.println(getClass()+"\t"+getName()+ "\t"+getSurname()+"Doç. Ogretim uyesi oldugunda alabilirsin");
		}
		else if(vehicleObj instanceof Car) {
			System.out.println(getClass()+"\t"+getName()+ "\t"+getSurname()+"Prof. Ogretim uyesi oldugunda alabilirsin");
		}
		
	}

}
