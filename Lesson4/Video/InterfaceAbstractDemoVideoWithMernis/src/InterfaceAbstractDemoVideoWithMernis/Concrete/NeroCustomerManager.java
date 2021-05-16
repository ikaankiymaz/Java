package InterfaceAbstractDemoVideoWithMernis.Concrete;


import InterfaceAbstractDemoVideoWithMernis.Absract.BaseCustomerManager;
import InterfaceAbstractDemoVideoWithMernis.Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{
	
	@Override
	public void save(Customer customer) {
		
		System.out.println("Saved to Database for Nero : " + customer.getFirstName() + " " + customer.getLastName());
	}
	

}
