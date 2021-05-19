package InterfaceAbstractGameVideoWithMernis.Abstract;

import InterfaceAbstractGameVideoWithMernis.Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerManager {
	
	public abstract void save(Customer customer);
	
	public abstract void delete(Customer customer);
	
	public abstract void update(Customer customer);

}
