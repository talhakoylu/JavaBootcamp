package business;

import entities.User;

public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getFirstName() + " added.");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName() + " updated");
	}
	
	public void delete(int id) {
		System.out.println("User deleted.");
	}
	
	public void login(User user) {
		System.out.println("User has successfully logged in which user has that email address " + user.getEmail());
	}
	
	public void register(User user) {
		System.out.println("You have successfully registered on the website, congrats.");
	}
}
