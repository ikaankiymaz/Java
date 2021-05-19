package InterfaceAbstractGameVideoWithMernis.Concrete;

import InterfaceAbstractGameVideoWithMernis.Abstract.BaseCustomerManager;
import InterfaceAbstractGameVideoWithMernis.Abstract.ICustomerCheckService;
import InterfaceAbstractGameVideoWithMernis.Entities.Customer;

public class PeekCustomerManager extends BaseCustomerManager {

	private ICustomerCheckService customerCheckService;

	public PeekCustomerManager(ICustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if (customerCheckService.CheckIfRealPerson(customer)) {
			System.out
					.println("Saved to Database for Peek : " + customer.getFirstName() + " " + customer.getLastName());
		} else {
			System.out.println("Not a valid person.");
		}
	}

	@Override
	public void delete(Customer customer) {
		if (customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println(
					"Deleted from Database for Peek : " + customer.getFirstName() + " " + customer.getLastName());
		} else {
			System.out.println("Not a valid person.");
		}
	}

	@Override
	public void update(Customer customer) {
		if (customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println(
					"Updated to Database for Peek : " + customer.getFirstName() + " " + customer.getLastName());
		} else {
			System.out.println("Not a valid person.");
		}

	}

}
