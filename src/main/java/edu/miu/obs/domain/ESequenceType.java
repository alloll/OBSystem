package edu.miu.obs.domain;

/**
 * The Enum ESequenceType.
 * @author Elias Rurangwa
 * @version 1.0
 */
public enum ESequenceType {
	
	/** The order. */
	ORDER("Order"),
	
	/** The payment. */
	PAYMENT("Payment");
	
	/** The status. */
	private String status;
	
	/**
	 * Instantiates a new e sequence type.
	 *
	 * @param status the status
	 */
	private ESequenceType(String status) {
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
