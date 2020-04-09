package edu.miu.obs.validation;

import org.springframework.validation.Errors;

/**
 * The Class ValidationException.
 * 
 * @author Elias Rurangwa
 * @version 1.0
 */
public class ValidationException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Errors errors;

	// Parameterless Constructor
	public ValidationException() {
	}

	// Constructor that accepts a message
	public ValidationException(final Errors errors) {
		this.errors = errors;
	}

	/**
	 * Gets the errors.
	 *
	 * @return the errors
	 */
	public Errors getErrors() {
		return errors;
	}
}
