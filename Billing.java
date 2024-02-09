package repairShopSystem;

public class Billing {
    private String invoiceId;
    private String partsUsed;
    private double additionalCharges;
    private int totalCountPartsUsed;
    private double workOrder;

    public Billing(String invoiceId, String partsUsed, double additionalCharges, int totalCountPartsUsed) {
		super();
		this.invoiceId = invoiceId;
		this.partsUsed = partsUsed;
		this.additionalCharges = additionalCharges;
		this.totalCountPartsUsed = totalCountPartsUsed;
		this.workOrder = workOrder;
	}

	public String getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getPartsUsed() {
		return partsUsed;
	}

	public void setPartsUsed(String partsUsed) {
		this.partsUsed = partsUsed;
	}

	public double getAdditionalCharges() {
		return additionalCharges;
	}

	public void setAdditionalCharges(double additionalCharges) {
		this.additionalCharges = additionalCharges;
	}

	public int getTotalCountPartsUsed() {
		return totalCountPartsUsed;
	}

	public void setTotalCountPartsUsed(int totalCountPartsUsed) {
		this.totalCountPartsUsed = totalCountPartsUsed;
	}

	public double getWorkOrder() {
		return workOrder;
	}

	public void setWorkOrder(double workOrder) {
		this.workOrder = workOrder;
	}

	
    
}
