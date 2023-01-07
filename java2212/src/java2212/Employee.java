package java2212;

public abstract class Employee implements Payable {
	
	private String firstName, lastName, SSN;
	
	public Employee(String firstName, String lastName, String SSN) {
		setFirstName(firstName);
		setLastName(lastName);
		setSSN(SSN);
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "FirstName: "+getFirstName()+ "LastName: "+getLastName()+ "SSN: "+getSSN();
	}
}
