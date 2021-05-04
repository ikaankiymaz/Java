package inheritance_homework3;

public class UserManager {
	
	public void Add(User user) {
		
		System.out.println(user.firstName.substring(0,1)+user.lastName.substring(0,1)+user.userId+" sisteme eklendi.");
		
	}
	
	public void Remove(User user) {
		
		System.out.println(user.firstName.substring(0,1)+user.lastName.substring(0,1)+user.userId+" sistemden silindi.");
		
	}

}
