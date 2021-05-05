package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new SmsLogger(), new EmailLogger(), new DatabaseLogger(), new FileLogger()};
		CustomerManager customerManagerMultiply = new CustomerManager(loggers);
		CustomerManager customerManagerInduvidual = new CustomerManager(new EmailLogger());
		
		Customer customer1 = new Customer(1,"Engin","Demirog");
		Customer customer2 = new Customer(2,"Ilteris Kaan","Kiymaz");
		
		customerManagerInduvidual.add(customer2);
		customerManagerMultiply.addMultiply(customer1);

	}

}
