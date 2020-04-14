package edu.miu.obs.domain;

/**
 * The Enum EPaymentStatus.
 * 
 * @author Elias Rurangwa
 * @version 1.0
 */
public enum EPaymentStatus {
	CREATED("Created"), PAID("Paid"), CANCELED("Canceled");

	private String status;

	/**
	 * Instantiates a new e payment status.
	 *
	 * @param status the status
	 */
	private EPaymentStatus(String status) {
		this.status = status;
	}

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	
	

}
