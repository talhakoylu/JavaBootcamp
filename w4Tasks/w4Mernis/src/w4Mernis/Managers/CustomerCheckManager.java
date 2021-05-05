package w4Mernis.Managers;

import w4Mernis.Entities.Customer;
import w4Mernis.Interfaces.CustomerCheckService;

public class CustomerCheckManager implements CustomerCheckService{
	
	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;		
	}

}
