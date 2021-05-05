package inheritance2;

public class LogManager {
	// use enum or if correctly. Don't exaggerate or abuse.
	
	// WARNING: "If" cannot be used for systems with alternatives to each other.
	// If there is an alternative operation for our business, we should create a file for each operation.
	// e.g. EmailLogger.java 
//	public void log(int logType) {
//		if (logType == 1) {
//			System.out.println("Veritabanına loglandı");
//		}else if(logType == 2) {
//			System.out.println("Dosyaya loglandı");
//		}else {
//			System.out.println("Email gönderildi.");
//		}
//	}
}

/*
 * Log Types
 * 1- Database
 * 2- File
 * 3- Email
 */
