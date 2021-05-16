package InterfaceAbstractDemoVideoWithMernis;

import java.time.LocalDate;
import InterfaceAbstractDemoVideoWithMernis.Absract.BaseCustomerManager;
import InterfaceAbstractDemoVideoWithMernis.Adapters.MernisServiceAdapter;
import InterfaceAbstractDemoVideoWithMernis.Concrete.NeroCustomerManager;
import InterfaceAbstractDemoVideoWithMernis.Concrete.StarbucksCustomerManager;
import InterfaceAbstractDemoVideoWithMernis.Entities.Customer;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1, "ÝLTERÝÞ KAAN", "KIYMAZ", "12998731774", LocalDate.of(1997, 4, 22)));

	}

}
