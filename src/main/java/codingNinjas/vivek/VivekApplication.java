package codingNinjas.vivek;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class VivekApplication {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//		SpringApplication.run(VivekApplication.class, args);

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ArrayList<PaidCourse> paidCourses = new ArrayList<PaidCourse>();
		PaidCourse javaCourse = (PaidCourse) context.getBean("javaCourse");
		PaidCourse springCourse = (PaidCourse) context.getBean("springCourse");

		javaCourse.setCourseDetail("Basic Java");
		javaCourse.courseInstructor.setInstructorDetails("vivek", 25);

		springCourse.setCourseDetail("Spring and Spring Boot");
		springCourse.courseInstructor.setInstructorDetails("kumar", 26);

		paidCourses.add(springCourse);
		paidCourses.add(javaCourse);

		while (true) {

			UserList springUsers = (UserList) context.getBean("userList");
			UserList javaUsers = (UserList) context.getBean("userList");

			System.out.println("XXXX");
			System.out.println("Please select from the following");
			System.out.println("1.Register a new User");
			System.out.println("2. View Course Informataion");
			System.out.println("3. Exit");

			int userInput = sc.nextInt();
			sc.nextLine();
			if (userInput == 3) {
				break;
			}
			switch (userInput) {
			case 1: {

				System.out.println("XXXX");
				System.out.println("1.Please enter your good name");
				String name = sc.nextLine();
				System.out.println("2.your age");
				int age = sc.nextInt();
				System.out.println("3.location");
				sc.nextLine();
				String location = sc.nextLine();
				System.out.println("4.college name");
				String college = sc.nextLine();
				User newUser = (User) context.getBean("simpleUser");
				newUser.setUserDetails(name, age, location, college);

				System.out.println("XXXX");
				System.out.println("Please select a course");
				int ind = 0;
				for (PaidCourse course : paidCourses) {
					System.out.println(ind + " " + course.getCourseName());
					ind++;
				}
				int selectedOption = sc.nextInt();
				if (selectedOption >= paidCourses.size()) {
					System.out.println("invalid input");
				}
				PaidCourse paidCourse = paidCourses.get(selectedOption);
				paidCourse.userList.addUser(newUser);
				break;

			}
			case 2: {
				System.out.println("XXXX");
				System.out.println("select couse to view information");
				int cind = 0;

				for (PaidCourse pc : paidCourses) {
					System.out.println(cind + " " + pc.getCourseName() + "by " + pc.getInstructor().takeClass());
					cind++;
				}

				int seloption = sc.nextInt();
				if (seloption >= paidCourses.size()) {
					System.out.println("invald input");
					break;
				}
				paidCourses.get(seloption).getCourseName();
				System.out.println(
						paidCourses.get(seloption).getCourseName() + paidCourses.get(seloption).getInstructor());

				for (User user : paidCourses.get(seloption).getUserList().getUserList())

				{
					System.out.println(user.getUserDetails());
				}

				break;

			}

			default: {
				System.out.println("invalid input");
				break;
			}
			}

		}
		sc.close();
		context.close();
	}

}
