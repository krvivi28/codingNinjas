package codingNinjas.vivek;

public class SimpleUser implements User {

	String name;
	int age;
	String location;
	String collegeName;

	@Override
	public String getUserDetails() {
		// TODO Auto-generated method stub
		return "Hi I am " + this.name + " I am " + this.age + " years old" + " I am from " + this.location
				+ " and my collge is " + this.collegeName;
	}

	@Override
	public void setUserDetails(String name, int age, String location, String college) {
		this.name = name;
		this.age = age;
		this.location = location;
		this.collegeName = college;

	}

}
