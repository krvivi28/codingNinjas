package codingNinjas.vivek;

import java.util.ArrayList;

public class SimpleUserList implements UserList {
	
	ArrayList<User> listofUsers;
	
	public SimpleUserList()
	{
		listofUsers=new ArrayList<>();
	}

	@Override
	public ArrayList<User> getUserList() {
		// TODO Auto-generated method stub
		return this.listofUsers;
	}

	@Override
	public void addUser(User user) {
		this.listofUsers.add(user);

	}

}
