package w4GameBackend.Interfaces;

import w4GameBackend.Entities.*;

public interface CampaignService {
	void add(Campaign campaign);
	void update(Campaign campaign);
	void delete(Campaign campaign);
	double calculateCampaignPrice(Game game, Campaign campaign);
}
