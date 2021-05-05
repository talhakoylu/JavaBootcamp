package w4GameBackend;

import w4GameBackend.Concrete.CampaignManager;
import w4GameBackend.Concrete.CheckIfRealPersonManager;
import w4GameBackend.Concrete.GameManager;
import w4GameBackend.Concrete.GameSaleManager;
import w4GameBackend.Concrete.PlayerManager;
import w4GameBackend.Entities.Campaign;
import w4GameBackend.Entities.Game;
import w4GameBackend.Entities.Player;
import w4GameBackend.Interfaces.GameSaleService;

public class Main {

	public static void main(String[] args) {
		Player player1 = new Player();
		player1.setId(1);
		player1.setFirstName("Ahmet Talha");
		player1.setLastName("Köylü");
		player1.setNationalIdentity("12345678910");
		player1.setBirthYear(1999);
		PlayerManager playerManager = new PlayerManager(new CheckIfRealPersonManager());
		playerManager.add(player1);
		player1.setFirstName("Mehmet Burak");
		playerManager.update(player1);
		
		Game game = new Game();
		game.setId(1);
		game.setTitle("Game 1");
		game.setGenre("Horror");
		game.setPrice(154);
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		
		Campaign campaign = new Campaign();
		campaign.setId(1);
		campaign.setCampaignTitle("Kampanya 1");
		campaign.setDiscountRate(50);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		
		GameSaleManager gameSaleManager = new GameSaleManager(new CampaignManager());
		gameSaleManager.sale(game, player1);
		gameSaleManager.sale(game, player1, campaign);
	}

}
