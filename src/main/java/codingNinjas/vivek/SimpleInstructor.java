package codingNinjas.vivek;

public class SimpleInstructor implements Instructor {

	String name;
	int age;

	@Override
	public void setInstructorDetails(String name, int age) {
		this.name = name;
		this.age = age;

	}

	@Override
	public String takeClass() {
		return "Hi, My name is" +this.name+" and I am "+this.age+" years old";

	}
	
	public void init()
	{
		System.out.println("SimpleInstructor constructor created");
	}
	
	public void destroy()
	{
		System.out.println("SimpleInstructor object to be destroyd");
	}

}
