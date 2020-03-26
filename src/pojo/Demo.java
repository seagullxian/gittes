package pojo;

import java.util.List;

public class Demo {
	User user;
	List<User> users;
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Demo [user=" + user + ", users=" + users + "]";
	}

	
}
