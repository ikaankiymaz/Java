package InterfaceAbstractGameVideoWithMernis.Concrete;

import InterfaceAbstractGameVideoWithMernis.Abstract.BaseCampaignManager;
import InterfaceAbstractGameVideoWithMernis.Abstract.ICustomerCheckService;
import InterfaceAbstractGameVideoWithMernis.Entities.Campaign;

public class PeekCampaignManager extends BaseCampaignManager{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getTitle() + " has been added.");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getTitle() + " has been deleted.");
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getTitle() + " has been updated.");
	}

}
