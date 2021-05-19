package InterfaceAbstractGameVideoWithMernis.Concrete;

import InterfaceAbstractGameVideoWithMernis.Abstract.BaseSaleManager;
import InterfaceAbstractGameVideoWithMernis.Entities.Campaign;
import InterfaceAbstractGameVideoWithMernis.Entities.Customer;
import InterfaceAbstractGameVideoWithMernis.Entities.Game;

public class PeekSaleManager extends BaseSaleManager {

	@Override
	public void sale(Customer customer, Game game, Campaign campaign) {

		double discountedPrice = game.getPrice() - (game.getPrice() * campaign.getDiscountRate() / 100);

		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " bought " + game.getName()
				+ " for $" + discountedPrice + " by taking advantage of the " + campaign.getTitle() + " campaign.");
	}

}
