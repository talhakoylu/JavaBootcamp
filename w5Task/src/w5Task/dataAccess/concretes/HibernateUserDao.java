package w5Task.dataAccess.concretes;

import java.util.List;

import w5Task.dataAccess.abstracts.UserDao;
import w5Task.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User entity) {
		System.out.println("User added.");
	}

	@Override
	public void update(User entity) {
		System.out.println("User updated.");
	}

	@Override
	public void delete(User entity) {
		System.out.println("User deleted.");
	}

	@Override
	public User get(int id) {
		System.out.println("User getirildi.");
		return null;
	}

	@Override
	public List<User> getAll() {
		System.out.println("Userlar listelendi.");
		return null;
	}

}
