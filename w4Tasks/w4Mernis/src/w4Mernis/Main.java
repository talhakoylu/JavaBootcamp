package w4Mernis;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
import w4Mernis.Adapters.MerniceServiceAdapter;
import w4Mernis.Entities.Customer;
import w4Mernis.Managers.BaseCustomerManager;
import w4Mernis.Managers.NeroCustomerManager;
import w4Mernis.Managers.StarbucksCustomerManager;

public class Main {

	public static void main(String[] args) {
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		try {
			boolean result = kpsPublic.TCKimlikNoDogrula(Long.parseLong("12345678910"), "AHMET TALHA", "KÖYLÜ", 1999);
			System.out.println(result ? "Verification successfull" : "Verification unsuccessful");
		} catch (Exception e) {
			System.out.println(e);
		}
				
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MerniceServiceAdapter());
		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setFirstName("Ahmet Talha");
		customer1.setLastName("Köylü");
		customer1.setNationalityId("12345678910");
		customer1.setBirthYear(1999);
		customerManager.save(customer1);
	}

}
