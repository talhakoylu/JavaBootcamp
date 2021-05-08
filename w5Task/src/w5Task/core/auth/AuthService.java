package w5Task.core.auth;

import w5Task.entities.concretes.User;

public interface AuthService {
	void login(User user);
	void register(User user);
}
