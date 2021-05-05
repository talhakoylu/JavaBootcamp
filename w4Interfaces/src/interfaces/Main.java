package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers = {new DatabaseLogger(), new FileLogger()};
		CustomerManager customerManager = new CustomerManager(loggers);
		Customer talha = new Customer(1, "Ahmet Talha", "Köylü");
		customerManager.add(talha);

	}

}
