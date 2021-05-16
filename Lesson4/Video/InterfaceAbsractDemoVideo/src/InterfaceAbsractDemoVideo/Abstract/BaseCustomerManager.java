package InterfaceAbsractDemoVideo.Abstract;

import InterfaceAbsractDemoVideo.Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerManager{
	
	public abstract void save(Customer customer);


}
