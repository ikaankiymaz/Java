package InterfaceAbstractGameVideoWithMernis.Abstract;

import InterfaceAbstractGameVideoWithMernis.Entities.Campaign;

public abstract class BaseCampaignManager implements ICampaignManager {

	public abstract void add(Campaign campaign);

	public abstract void delete(Campaign campaign);

	public abstract void update(Campaign campaign);

}
