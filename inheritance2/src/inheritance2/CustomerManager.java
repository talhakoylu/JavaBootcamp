package inheritance2;

public class CustomerManager {
//	public void add() {
//		//customer add operations
//		System.out.println("Customer added");
//		DatabaseLogger dbLogger = new DatabaseLogger();
//		dbLogger.log();
//		
//		//after a while, the boss wants us to make a file logger.
//		//if we create multiple instance in a method, the meaning is this code is smell bad.
//	}
	//thats why we have to write our codes like below
	public void add(Logger logger) {
		//customer add operations
		System.out.println("Customer added");
		logger.log();
		
	}
}
