package edu.miu.obs.domain;

/**
 * The Enum ELifeCycle.
 * 
 * @author Elias Rurangwa
 * @version 1.0
 */
public enum ELifeCycle {
	ACTIVE(0),
	/** The inactive. */
	INACTIVE(1);

	/** The state. */
	private int state;

	/**
	 * Instantiates a new e life cycle.
	 *
	 * @param state the state
	 */
	private ELifeCycle(final int state) {
		this.state = state;
	}

	/**
	 * Gets the sate.
	 *
	 * @return the sate
	 */
	public int getSate() {
		return state;
	}
}
