package InterfaceAbstractDemoVideoWithMernis.Adapters;

import java.rmi.RemoteException;

import InterfaceAbstractDemoVideoWithMernis.Absract.ICustomerCheckService;
import InterfaceAbstractDemoVideoWithMernis.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = true;
		try {
			result = client.TCKimlikNoDogrula(Long. parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());
		}catch(RemoteException e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
