package w5Task.core.auth;

import w5Task.entities.concretes.User;
import w5Task.googleAuth.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements AuthService{
	
	GoogleAuthManager googleAuth = new GoogleAuthManager();
	
	@Override
	public void login(User user) {
		googleAuth.login(user.getEmail(), user.getPassword());
	}

	@Override
	public void register(User user) {
		googleAuth.register(user.getEmail(), user.getPassword());
	}

}
