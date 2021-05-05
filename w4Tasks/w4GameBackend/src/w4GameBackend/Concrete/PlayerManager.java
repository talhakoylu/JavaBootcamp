package w4GameBackend.Concrete;

import w4GameBackend.Entities.Player;
import w4GameBackend.Interfaces.PlayerService;

public class PlayerManager implements PlayerService{
	
	private CheckIfRealPersonManager check;
	
	public PlayerManager(CheckIfRealPersonManager check) {
		this.check = check;
	}

	@Override
	public void add(Player player) {
		boolean result = check.check(player);
		if(result) {
			System.out.println(player.getFirstName() + "'s credentials have been successfully verified and registered to the system.");
		}else {
			System.out.println("The player information is not valid.");
		}
		
	}

	@Override
	public void update(Player player) {
		System.out.println(player.getFirstName() + " was successfully updated.");
	}

	@Override
	public void delete(Player player) {
		System.out.println(player.getFirstName() + " was successfully deleted.");
	}

}
