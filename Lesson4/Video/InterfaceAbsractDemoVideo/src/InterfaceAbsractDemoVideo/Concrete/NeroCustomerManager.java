package InterfaceAbsractDemoVideo.Concrete;

import InterfaceAbsractDemoVideo.Abstract.BaseCustomerManager;
import InterfaceAbsractDemoVideo.Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{
	
	@Override
	public void save(Customer customer) {
		
		System.out.println("Saved to Database = " + customer.getFirstName());
	}


}
