package java2202;

public class Author {
	private String name,gender,gmail;
	
	//constructor with 3 arg
	public Author (String name, String gender, String gmail) {
		this.name = name;
		this.setGender(gender);
		this.setGmail(gmail);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	
	@Override
	public String toString() {
		return " Name: "+name+ " Gender: "+gender+ " Gmail: "+gmail;
	}
}
