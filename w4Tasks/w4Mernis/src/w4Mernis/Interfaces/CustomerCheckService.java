package w4Mernis.Interfaces;

import java.rmi.RemoteException;

import w4Mernis.Entities.Customer;

public interface CustomerCheckService {
	boolean CheckIfRealPerson(Customer customer);
}
