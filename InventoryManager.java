package repairShopSystem;

import java.util.HashMap;
import java.util.Map;

public class InventoryManager {
	private Map<String, Integer> inventory;

	public InventoryManager() {
		inventory = new HashMap<>();
	}

	public void addInventoryItem(String item, int quantity) {
		inventory.put(item, quantity);
	}

	public void updateInventory(String item, int quantity) {
		int currentQuantity = inventory.getOrDefault(item, 0);
		inventory.put(item, currentQuantity + quantity);
	}

}
