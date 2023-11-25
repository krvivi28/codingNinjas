package codingNinjas.vivek;

public class PaidCourse implements Course {
	
	String courseName;
	Instructor courseInstructor;
	UserList userList;

	@Override
	public void setCourseDetail(String courseName) {
		this.courseName=courseName;

	}

	@Override
	public UserList getUserList() {
		return this.userList;

	}

	@Override
	public void getInstructor() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getCourseName() {
		// TODO Auto-generated method stub

	}

}
