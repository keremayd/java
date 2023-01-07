package java2212;

public class SalaryEmployee extends Employee{
	
	private double weeklySalary;
	
	@Override
	public double getPaymentAmount() {
		return 0;
	}
	
	public SalaryEmployee(String firstName, String lastName, String SSN, double weeklySalary) {
		super(firstName, lastName, SSN);
		setWeeklySalary(weeklySalary);
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary>0?weeklySalary:0;
	}

	@Override
	public String toString() {
		return super.toString()+"\nWeeklySalary: "+getWeeklySalary();
	}

}
