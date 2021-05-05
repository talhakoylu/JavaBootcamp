package w4Mernis.Managers;

import w4Mernis.Entities.Customer;
import w4Mernis.Interfaces.CustomerService;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to db: " + customer.getFirstName());
		
	}
	
}
