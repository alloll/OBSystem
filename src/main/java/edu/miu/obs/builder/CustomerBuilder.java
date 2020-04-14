package edu.miu.obs.builder;

import edu.miu.obs.domain.Customer;

/**
 * The Class CustomerBuilder.
 * 
 * @author Elias Rurangwa
 * @version 1.0
 */
public class CustomerBuilder {

	/** The customer. */
	private Customer customer;

	/**
	 * Instantiates a new customer builder.
	 */
	public CustomerBuilder() {
		customer = new Customer();
	}


	/**
	 * With first name.
	 *
	 * @param name the name
	 * @return the customer builder
	 */
	public CustomerBuilder withFirstName(final String name) {
		customer.setFirstName(name);
		return this;
	}
	
	/**
	 * With last name.
	 *
	 * @param name the name
	 * @return the customer builder
	 */
	public CustomerBuilder withLastName(final String name) {
		customer.setLastName(name);
		return this;
	}

	/**
	 * Builds the.
	 *
	 * @return the customer
	 */
	public Customer build() {
		return customer;
	}

}
