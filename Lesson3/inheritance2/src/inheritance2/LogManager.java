package inheritance2;

public class LogManager {
	//Birbirinin alternatifi olan kod bloklarý if ile yönetilmez.!!!!!!
	public void log(int logType) {
		if (logType == 1) {
			System.out.println("Veritabanýna loglandý.");
		} else if (logType == 2) {
			System.out.println("Dosyaya loglandý.");
		} else {
			System.out.println("Email loglandý.");
		}
	}

}

//1 - Database
//2 - File
//3 - Email