
public class Person {

	private String name,surname;
	private int age;
	private boolean licence;
	
	public Person(String name,String surname,int age, boolean licence){
		setName(name);
		setSurname(surname);
		setAge(age);
		setLicence(licence);
	}
	
	
	
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age>0? age:0;
	}
	public boolean isLicence() {
		return licence;
	}
	public void setLicence(boolean licence) {
		this.licence = licence;
	}
	
	@Override
	public String toString(){
		return "Name :"+name+" Surname :"+ getName()+" Age : "+age+" Licence :"+ isLicence();
		
	}
	
	
	
	
	
	
	
}
