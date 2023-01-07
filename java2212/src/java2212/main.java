package java2212;

public class main {

	public static void main(String[] args) {
		Payable[] objects= new Payable[4];
		
		objects[0]= new Invoice("A14","R",14,7);
		objects[1]= new Invoice("z","a",7,5);
		objects[2]= new SalaryEmployee("A","R","c",7);
		objects[3]= new SalaryEmployee("M","E","G",7);
		//Invoice obj= new Invoice[null,null,1,1];

		
		for(Payable pyb: objects) {
			System.out.println(pyb+ " Payment Amount: "+ pyb.getPaymentAmount());
		}
	}
}
