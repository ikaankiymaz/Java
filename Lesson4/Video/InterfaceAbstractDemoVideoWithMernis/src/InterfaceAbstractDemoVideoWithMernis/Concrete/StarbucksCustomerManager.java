package InterfaceAbstractDemoVideoWithMernis.Concrete;


import InterfaceAbstractDemoVideoWithMernis.Absract.BaseCustomerManager;
import InterfaceAbstractDemoVideoWithMernis.Absract.ICustomerCheckService;
import InterfaceAbstractDemoVideoWithMernis.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private ICustomerCheckService customerCheckService;

	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) {

		if (customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println(
					"Saved to Database for Starbucks : " + customer.getFirstName() + " " + customer.getLastName());
		} else {
			System.out.println("Not a valid person.");
		}
	}
	
	

}
