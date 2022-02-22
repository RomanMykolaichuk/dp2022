package users;

import java.util.ArrayList;
import java.util.List;

public class Mock {
	
	private List<User1> userList = new ArrayList<>();
	
	
	public Mock () {		
		this.userList.add(new User1(0,"Roman",40));
		this.userList.add(new User1(1,"Olena",24));
		this.userList.add(new User1(2,"Stephan",19));
	}

	public List<User1> getUserList() {
		return userList;
	}

	public void setUserList(List<User1> userList) {
		this.userList = userList;
	}
	
	

}
