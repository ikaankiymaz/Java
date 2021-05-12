package interfacesVideo;

public class CustomerManager {

	private ICustomerDal customerDal; // birinci yontem. Programci bunu unutabiliyor.

	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	public void add() {
		// is kodlari yazilir.
		customerDal.add();
	}

}
