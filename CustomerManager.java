package repairShopSystem;

import java.util.HashMap;
import java.util.Map;

public class CustomerManager {
	private Map<String, Customer> customers;

	public CustomerManager() {
		customers = new HashMap<>();
	}

	public void addCustomer(String customerId, Customer customer) {
		customers.put(customerId, customer);
	}

	public Customer findCustomer(String customerId) {
		return customers.get(customerId);
	}

}
