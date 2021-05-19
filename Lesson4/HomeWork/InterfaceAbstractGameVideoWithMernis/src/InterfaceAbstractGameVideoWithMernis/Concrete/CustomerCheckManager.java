package InterfaceAbstractGameVideoWithMernis.Concrete;

import InterfaceAbstractGameVideoWithMernis.Abstract.ICustomerCheckService;
import InterfaceAbstractGameVideoWithMernis.Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return true;
	}

}
