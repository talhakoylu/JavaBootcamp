package w4GameBackend.Interfaces;

import w4GameBackend.Entities.Game;

public interface GameService {
	void add(Game game);
	void update(Game game);
	void delete(Game game);
}
