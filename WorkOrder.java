package repairShopSystem;

public class WorkOrder {
	private String orderId;
	private String jobDetails;
	private String partsUsed;
	private double pricing;
	private int totalCountPartsUsed;

	public WorkOrder(String orderId, String jobDetails, String partsUsed, double pricing, int totalCountPartsUsed) {
		this.orderId = orderId;
		this.jobDetails = jobDetails;
		this.partsUsed = partsUsed;
		this.pricing = pricing;
		this.totalCountPartsUsed = totalCountPartsUsed;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getJobDetails() {
		return jobDetails;
	}

	public void setJobDetails(String jobDetails) {
		this.jobDetails = jobDetails;
	}

	public String getPartsUsed() {
		return partsUsed;
	}

	public void setPartsUsed(String partsUsed) {
		this.partsUsed = partsUsed;
	}

	public double getPricing() {
		return pricing;
	}

	public void setPricing(double pricing) {
		this.pricing = pricing;
	}

	public int getTotalCountPartsUsed() {
		return totalCountPartsUsed;
	}

	public void setTotalCountPartsUsed(int totalCountPartsUsed) {
		this.totalCountPartsUsed = totalCountPartsUsed;
	}

}
