package w4GameBackend.Concrete;

import w4GameBackend.Entities.Campaign;
import w4GameBackend.Entities.Game;
import w4GameBackend.Entities.Player;
import w4GameBackend.Interfaces.CampaignService;
import w4GameBackend.Interfaces.GameSaleService;

public class GameSaleManager implements GameSaleService{
	
	private CampaignService campaignService;
	
	public GameSaleManager() {
	}

	public GameSaleManager(CampaignService campaignService) {
		this.campaignService = campaignService;
	}

	@Override
	public void sale(Game game, Player player) {
		System.out.println(player.getFirstName() + " bought the " + game.getTitle() + " game");
	}

	@Override
	public void sale(Game game, Player player, Campaign campaign) {
		double price = campaignService.calculateCampaignPrice(game, campaign);
		System.out.println(player.getFirstName() + " bought the " + game.getTitle() + " game with a promotional price: " + price);
	}

}
