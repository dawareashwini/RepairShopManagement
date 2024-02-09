package repairShopSystem;

import java.util.Scanner;

public class RepairShopManagementSystem {
	private static WorkOrder workOrder;

	public static void main(String[] args) {

		CustomerManager customerManager = new CustomerManager();
		InventoryManager inventoryManager = new InventoryManager();
		CustomerCommunication customerCommunication = new CustomerCommunication();

		Scanner scanner = new Scanner(System.in);
		boolean exit = false;

		while (!exit) {
			System.out.println("Choose an option:");
			System.out.println("1. Add Customer");
			System.out.println("2. Add Inventory Item");
			System.out.println("3. Place Work Order");
			System.out.println("4. Generate Invoice");
			System.out.println("5. Send Notification to Customer");
			System.out.println("6. Exit");
			System.out.println("*********************************************************************");

			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				System.out.println("Enter customer details:");
				System.out.print("customer ID: ");
				String customerId = scanner.nextLine();
				System.out.print("Name: ");
				String name = scanner.nextLine();
				System.out.print("Contact Details: ");
				String contactDetails = scanner.nextLine();
				Customer customer = new Customer(name, contactDetails);
				System.out.println("Customer Added Successfully...!");
				System.out.println("___________________________________________________________________");
				customerManager.addCustomer(customerId, customer);
				break;
			case 2:
				System.out.println("Enter inventory item details:");
				System.out.print("Item Name: ");
				String itemName = scanner.nextLine();
				System.out.print("Item Quantity: ");
				int quantity = scanner.nextInt();
				System.out.println("Item Details Added Successfully...!");
				System.out.println("___________________________________________________________________");
				inventoryManager.addInventoryItem(itemName, quantity);
				break;

			case 3:
				System.out.println("Enter work order details:");
				System.out.print("Work ID: ");
				String jobId = scanner.nextLine();
				System.out.print("Work Details: ");
				String jobDetails = scanner.nextLine();
				System.out.print("Which Parts Are Used: ");
				String partsUsed = scanner.nextLine();
				System.out.print("How Much Prize: ");
				double pricing = scanner.nextDouble();
				System.out.print("How Much Parts Are Used: ");
				int totalCountPartsUsed = scanner.nextInt();
				workOrder = new WorkOrder(jobId, jobDetails, partsUsed, pricing, totalCountPartsUsed);

				// Update inventory
				String[] partsUsedArray = partsUsed.split(",");
				for (String part : partsUsedArray) {
					inventoryManager.updateInventory(part.trim(), -1); // Decrease inventory count by 1 for each part
																		// used
				}
				System.out.println("Work Order Processed Successfully...!");
				System.out.println("___________________________________________________________________");
				break;

			case 4:
				// Generate invoice logic
				System.out.println("Enter invoice details:");
				System.out.print("Invoice ID: ");
				String invoiceId = scanner.nextLine();
				System.out.print("Which Part Used: ");
				String partsUsedInvoice = scanner.nextLine();
				System.out.print("Additional Charges: ");
				double additionalCharges = scanner.nextDouble();
				System.out.print("Total Count of Part Used: ");
				int totalCountPartsUsedInvoice = scanner.nextInt();

				// Calculate total cost
				double totalCost = workOrder.getPricing() * workOrder.getTotalCountPartsUsed() + additionalCharges;

				// Generate invoice
				Billing billing = new Billing(invoiceId, partsUsedInvoice, additionalCharges,
						totalCountPartsUsedInvoice);

				System.out.println("Total Cost: $" + totalCost);
				System.out.println("___________________________________________________________________");
				break;
			case 5:
				System.out.println("Enter notification message:");
				String message = scanner.nextLine();
				customerCommunication.sendNotification(message);
				System.out.println("___________________________________________________________________");
				break;
			case 6:
				exit = true;
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice. Please enter a number between 1 and 6.");
			}
		}
		scanner.close();
	}

	private static int calculateTotalPartsUsed(String partsUsed) {
		// Split parts used string and count total parts
		String[] partsArray = partsUsed.split(",");
		return partsArray.length;
	}
}
