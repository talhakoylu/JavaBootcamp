package w4Mernis.Adapters;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
import w4Mernis.Entities.Customer;
import w4Mernis.Interfaces.CustomerCheckService;

public class MerniceServiceAdapter implements CustomerCheckService {
	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoap client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
					customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),
					customer.getBirthYear());
		} catch (NumberFormatException | RemoteException e) {
			System.out.println(e);
			return false;
		}
	}
}
