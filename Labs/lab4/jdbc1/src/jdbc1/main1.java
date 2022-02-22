package jdbc1;

import entity.User;

public class main1 {

	public static void main(String[] args) {
		
		Connect connect = new Connect();
//		System.out.println(connect);
		SqlCRUD crud = new SqlCRUD();
		crud.setConnection(connect.getCon());
		User user = new User(1,"SomeUser",22);
		crud.create(user);
		System.out.println(crud.read());
		user.setName("Updated user");
		crud.update(1, user);	
		
		System.out.println(crud.read());
		for(int i=0;i<100;i++) {
			crud.delete(i);
		}
		System.out.println(crud.read());
		connect.closeCon();

	}

}
