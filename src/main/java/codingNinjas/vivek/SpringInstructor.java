package codingNinjas.vivek;

public class SpringInstructor implements Instructor {

	String name;
	int age;

	@Override
	public void setInstructorDetails(String name, int age) {
		this.name = name;
		this.age = age;

	}

	@Override
	public String takeClass() {
		return "Hi, My name is" +this.name+" and I will be your Spring instructor";

	}
	
	public void init()
	{
		System.out.println("SpringInstructor bean created");
	}
	
	public void destroy()
	{
		System.out.println("SimpleInstructor bean about to be destroyd");
	}

}
