package w4Mernis.Managers;

import w4Mernis.Entities.Customer;
import w4Mernis.Interfaces.CustomerCheckService;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private CustomerCheckService checkService;
		
	public StarbucksCustomerManager(CustomerCheckService checkService) {
		this.checkService = checkService;
	}

	@Override
	public void save(Customer customer) {
		if (checkService.CheckIfRealPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println("Invalid credentials. Enter valid credentials, please.");
		}
 		
	}
}