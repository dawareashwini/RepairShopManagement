package repairShopSystem;

import java.util.Scanner;

public class Customer {
	private String name;
	private String contactDetails;

	public Customer(String name, String contactDetails) {
		super();
		this.name = name;
		this.contactDetails = contactDetails;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(String contactDetails) {
		this.contactDetails = contactDetails;
	}

}
