package InterfaceAbsractDemoVideo;

import java.time.LocalDate;

import InterfaceAbsractDemoVideo.Abstract.BaseCustomerManager;
import InterfaceAbsractDemoVideo.Concrete.NeroCustomerManager;
import InterfaceAbsractDemoVideo.Concrete.StarbucksCustomerManager;

public class Main {
	
	
	
	BaseCustomerManager customerManager = new NeroCustomerManager();
//	Customer(int id, String firstName, String lastName, String nationalityId, LocalDate dateOfBirth)
//	customerManager.save(new Customer(1, "Ilteris Kaan", "Kiymaz", LocalDate.of(1996, 1, 1), "1234"));
//	customerManager.save(new Customer(1,"Ilteris Kaan","Kiymaz","12312312312"), LocalDate.of(1996, 1, 1));

}
