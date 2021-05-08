package w5Task.core.auth;

import w5Task.entities.concretes.User;

public class EmailAuthManager implements AuthService{

	@Override
	public void login(User user) {
		System.out.println(user.getFirstName() + " has successfully logged in.");
	}

	@Override
	public void register(User user) {
		System.out.println(user.getFirstName() + " has successfully registered.");
	}

}
