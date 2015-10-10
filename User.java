import java.util.*;

public class User {
	private String name;
	private ArrayList<User> friends;
	private ArrayList<Task> tasks;
	private int karma;
	
	public User() {
		name = "";
		friends = new ArrayList<User>();
		tasks = new ArrayList<Task>();
		karma = 1000;
	}
	public User(String username) {
		name = username;
		friends = new ArrayList<User>();
		tasks = new ArrayList<Task>();
		karma = 1000;
	}
	public void addFriend(User x) {
		friends.add(x);
	}
	public void addTask(Task x) {
		tasks.add(x);
	}
	
}
