package InterfaceAbstractGameVideoWithMernis;

import java.time.LocalDate;

import InterfaceAbstractGameVideoWithMernis.Abstract.BaseCampaignManager;
import InterfaceAbstractGameVideoWithMernis.Abstract.BaseCustomerManager;
import InterfaceAbstractGameVideoWithMernis.Abstract.BaseGameManager;
import InterfaceAbstractGameVideoWithMernis.Abstract.BaseSaleManager;
import InterfaceAbstractGameVideoWithMernis.Adapters.MernisServiceAdapter;
import InterfaceAbstractGameVideoWithMernis.Concrete.PeekCampaignManager;
import InterfaceAbstractGameVideoWithMernis.Concrete.PeekCustomerManager;
import InterfaceAbstractGameVideoWithMernis.Concrete.PeekGameManager;
import InterfaceAbstractGameVideoWithMernis.Concrete.PeekSaleManager;
import InterfaceAbstractGameVideoWithMernis.Concrete.ZyngaCustomerManager;
import InterfaceAbstractGameVideoWithMernis.Entities.Campaign;
import InterfaceAbstractGameVideoWithMernis.Entities.Customer;
import InterfaceAbstractGameVideoWithMernis.Entities.Game;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager customerManager = new PeekCustomerManager(new MernisServiceAdapter());
		Customer customer = new Customer(1, "ÝLTERÝÞ KAAN", "KIYMAZ", "12998731774", LocalDate.of(1997, 4, 22));
		customerManager.save(customer);
		
		
		BaseGameManager gameManager = new PeekGameManager();
		Game game = new Game(1, "GTA V", "FPS", 200 , 2014, "Action");
		gameManager.add(game);
		
		BaseCampaignManager campaignManager = new PeekCampaignManager();
		Campaign campaign = new Campaign(1, "Unbelievable Discount", null, LocalDate.of(2021, 5, 19), 20);
		campaignManager.update(campaign);
		
		BaseSaleManager saleManager = new PeekSaleManager();
		saleManager.sale(customer, game, campaign);
		
	}

}
