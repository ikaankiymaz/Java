package InterfaceAbstractDemoVideoWithMernis.Concrete;

import InterfaceAbstractDemoVideoWithMernis.Absract.ICustomerCheckService;
import InterfaceAbstractDemoVideoWithMernis.Entities.Customer;


public class CustomerCheckManager implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return true;
	}

}
