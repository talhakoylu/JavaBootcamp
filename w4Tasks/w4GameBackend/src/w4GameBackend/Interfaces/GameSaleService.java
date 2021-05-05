package w4GameBackend.Interfaces;

import w4GameBackend.Entities.*;

public interface GameSaleService {
	void sale(Game game, Player player);
	void sale(Game game, Player player, Campaign campaign);
}
