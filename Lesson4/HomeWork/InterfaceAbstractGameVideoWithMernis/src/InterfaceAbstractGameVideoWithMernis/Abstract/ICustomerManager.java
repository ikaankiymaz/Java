package InterfaceAbstractGameVideoWithMernis.Abstract;

import InterfaceAbstractGameVideoWithMernis.Entities.Customer;

public interface ICustomerManager {
	
	void save(Customer customer);
	
	void delete(Customer customer);
	
	void update(Customer customer);

}
