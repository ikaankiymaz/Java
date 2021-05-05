package interfaces;

public class CustomerManager {
	
	private Logger logger;
	private Logger[] loggers;

	public CustomerManager(Logger logger) {
		//super();
		this.logger = logger;
	}
	
	public CustomerManager(Logger[] loggers) {
		//super();
		this.loggers = loggers;
	}

	//loosly(gevsek) - tightly(kati) coupled(bagli olmak)
	public void add(Customer customer) {
		System.out.println("Müþteri eklendi " + customer.getFirtsName());
		this.logger.log(customer.getFirtsName());
	}

	public void delete(Customer customer) {
		System.out.println("Müþteri silindi " + customer.getFirtsName());
		this.logger.log(customer.getFirtsName());
	}
	
	public void addMultiply (Customer customer) {
		System.out.println("Müþteri eklendi " + customer.getFirtsName());
		
		Utils.runLoggers(loggers, customer.getFirtsName());
	}
	
	public void deleteMultiply(Customer customer) {
		System.out.println("Müþteri silindi " + customer.getFirtsName());
		
		Utils.runLoggers(loggers, customer.getFirtsName());
		
	}

}
