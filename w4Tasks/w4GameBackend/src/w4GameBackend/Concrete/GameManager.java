package w4GameBackend.Concrete;

import w4GameBackend.Entities.Game;
import w4GameBackend.Interfaces.GameService;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getTitle() + " was added.");
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getTitle() + " was updated.");
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getTitle() + " was deleted.");
	}

}
