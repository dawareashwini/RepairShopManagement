package repairShopSystem;

public class JobIntake {
	private String jobId;
	private String jobDetails;

	public JobIntake(String jobId, String jobDetails) {
		this.jobId = jobId;
		this.jobDetails = jobDetails;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getJobDetails() {
		return jobDetails;
	}

	public void setJobDetails(String jobDetails) {
		this.jobDetails = jobDetails;
	}

}
