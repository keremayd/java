public class main {

	public static void main(String[] args) {
		Vehicle[] vehicleObj=new Vehicle[7];
		
		vehicleObj[0] = new Bike("a","b",0,"c",4);
		vehicleObj[1] = new Scooter("a","b",0,"c",4);
		vehicleObj[2] = new Car("a","b",0,"c",4);
		vehicleObj[3] = new Car("a","b",0,"c",4);
		vehicleObj[4] = new Motorcyle("a","b",0,"c",4);
		vehicleObj[5] = new Motorcyle("a","b",0,"c",4);
		vehicleObj[6] = new Scooter("a","b",0,"c",4);

		
		Person[] personObj = new Person[7];
		personObj[0]= new Prof("Meryem","Cicek",34,false,124, vehicleObj[0]);
		personObj[0]= new AsistantProfessor("Kerem","Aydın",44,true,1444, vehicleObj[3]);
	}

}
