package w5Task.dataAccess.abstracts;

import java.util.List;

public interface Dao<T> {
	void add(T entity);
	void update(T entity);
	void delete(T entity);
	T get(int id);
	List<T> getAll();
}
