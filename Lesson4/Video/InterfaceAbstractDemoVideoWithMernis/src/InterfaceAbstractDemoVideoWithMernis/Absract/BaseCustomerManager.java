package InterfaceAbstractDemoVideoWithMernis.Absract;

import InterfaceAbstractDemoVideoWithMernis.Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerManager{
	
	public abstract void save(Customer customer);

}
