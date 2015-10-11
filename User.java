import java.util.*;

public class User {
	private String name;
	private ArrayList<User> friends;
	private ArrayList<Task> tasks;
	private int karma;
	Scanner scanner = new Scanner(System.in);
	
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
	public String getName() {
		return name;
	}
	public void addFriend(User x) {
		friends.add(x);
	}
	public void addTask(Task x) {
		tasks.add(x);
	}
	public void setName(String x) {
		name = x;
	}
	public ArrayList<String> checkFriends() { // Gives list of names of friends in friends arraylist
		ArrayList<String> friendNames = new ArrayList<String>();
		for (int i = 0; i < friends.size(); i++) {
			friendNames.add(friends.get(i).getName());
		}
		return friendNames;
	}
	public ArrayList<String> checkTasks() { // Gives list of names of tasks in tasks arraylist
		ArrayList<String> taskNames = new ArrayList<String>();
		for (int i = 0; i < tasks.size(); i++) {
			taskNames.add(tasks.get(i).getName());
		}
		return taskNames;
	}
	public void verify(User x, Task y) { 
		if (checkFriends().contains(x.getName()) && x.checkTasks().contains(y.getName())) {
			System.out.println("Please input \"True\" if the task is complete, and \"False\" otherwise.");
			y.setStatus(scanner.nextBoolean());
		}
		else {
			System.out.println("Error, " + x.getName() + "is not a friend, or " + y.getName() + "is not a task.");
		}
	}
}
