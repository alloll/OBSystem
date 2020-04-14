package edu.miu.obs.domain;

/**
 * The Enum ECardType.
 * 
 * @author Elias Rurangwa
 * @version 1.0
 */
public enum ECardType {
	CREDIT("Credit"), DEBIT("Debit");

	/** The status. */
	private String status;

	/**
	 * Instantiates a new e card type.
	 *
	 * @param status the status
	 */
	private ECardType(final String status) {
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
