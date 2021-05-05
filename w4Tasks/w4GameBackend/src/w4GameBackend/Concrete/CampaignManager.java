package w4GameBackend.Concrete;

import w4GameBackend.Entities.Campaign;
import w4GameBackend.Entities.Game;
import w4GameBackend.Interfaces.CampaignService;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignTitle() + " added.");
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignTitle() + " updated.");		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignTitle() + " deleted.");
	}

	@Override
	public double calculateCampaignPrice(Game game, Campaign campaign) {
		return game.getPriceWithTax() - (game.getPrice() * campaign.getDiscountRate()) / 100;
	}

}
