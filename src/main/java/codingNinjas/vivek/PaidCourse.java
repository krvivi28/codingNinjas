package codingNinjas.vivek;

public class PaidCourse implements Course {
	
	String courseName;
	public Instructor courseInstructor;
	public UserList userList;
	
	public PaidCourse(Instructor courseInstructor,
	UserList userList )
	{
		this.courseInstructor=courseInstructor;
		this.userList=userList;
	}

	@Override
	public void setCourseDetail(String courseName) {
		this.courseName=courseName;

	}

	@Override
	public UserList getUserList() {
		return this.userList;

	}

	@Override
	public Instructor getInstructor() {
		return this.courseInstructor;

	}

	@Override
	public String getCourseName() {
		return this.courseName;

	}

}
