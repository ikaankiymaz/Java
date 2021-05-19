package InterfaceAbstractGameVideoWithMernis.Concrete;

import InterfaceAbstractGameVideoWithMernis.Abstract.BaseCustomerManager;
import InterfaceAbstractGameVideoWithMernis.Entities.Customer;

public class ZyngaCustomerManager extends BaseCustomerManager{

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to Database for Zynga : " + customer.getFirstName() + " " + customer.getLastName());
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Deleted from Database for Zynga : " + customer.getFirstName() + " " + customer.getLastName());
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Updated to Database for Zynga : " + customer.getFirstName() + " " + customer.getLastName());
	}

}
