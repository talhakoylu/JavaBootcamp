package w4GameBackend.Concrete;

import w4GameBackend.Entities.Player;
import w4GameBackend.Interfaces.CheckIfRealPersonService;

public class CheckIfRealPersonManager implements CheckIfRealPersonService{
	@Override
	public boolean check(Player player) {
		return true;
	}
}
