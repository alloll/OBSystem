package edu.miu.obs.domain;

/**
 * The Enum EOrderStatus.
 * @author Elias Rurangwa
 * @version 1.0
 */
public enum EOrderStatus {
	
	/** The created. */
	CREATED("Created"),
	
	/** The processed. */
	PROCESSED("Processed");
	
	/** The status. */
	private String status;
	
	/**
	 * Instantiates a new e order status.
	 *
	 * @param status the status
	 */
	private EOrderStatus(final String status) {
		this.status=status;
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
