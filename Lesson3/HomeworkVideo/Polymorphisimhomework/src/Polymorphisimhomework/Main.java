package Polymorphisimhomework;

public class Main {

	//Polymorphisim = Cok bicimlilik demektir.
	public static void main(String[] args) {
		
//		BaseLogger[] loggers = new BaseLogger[] { new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger() };
//
//		for(BaseLogger logger : loggers) {
//			logger.Log("Log mesajý");
//		}
		
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.add();
	}

}
