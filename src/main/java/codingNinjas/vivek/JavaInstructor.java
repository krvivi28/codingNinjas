package codingNinjas.vivek;

public class JavaInstructor implements Instructor {

	String name;
	int age;

	@Override
	public void setInstructorDetails(String name, int age) {
		this.name = name;
		this.age = age;

	}

	@Override
	public String takeClass() {
		return "Hi, My name is" +this.name+" and I will be your Java instructor";

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
