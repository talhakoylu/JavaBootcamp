package w4GameBackend.Interfaces;

import w4GameBackend.Entities.Player;

public interface PlayerService {
	void add(Player player);
	void update(Player player);
	void delete(Player player);
}
