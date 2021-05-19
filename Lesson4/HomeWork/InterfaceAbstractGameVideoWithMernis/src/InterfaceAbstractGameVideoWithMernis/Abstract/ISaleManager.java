package InterfaceAbstractGameVideoWithMernis.Abstract;

import InterfaceAbstractGameVideoWithMernis.Entities.Campaign;
import InterfaceAbstractGameVideoWithMernis.Entities.Customer;
import InterfaceAbstractGameVideoWithMernis.Entities.Game;

public interface ISaleManager {
	
	void sale(Customer customer, Game game, Campaign campaign);

}
