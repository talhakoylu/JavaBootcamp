package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer talha = new IndividualCustomer();
		talha.customerNumber = "12345";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "2345";
		
		CustomerManager customerManager = new CustomerManager();
//		customerManager.add(talha);
//		customerManager.add(hepsiBurada);
		
		Customer[] customers = {talha, hepsiBurada};
		customerManager.addMultiple(customers);
	}

}
