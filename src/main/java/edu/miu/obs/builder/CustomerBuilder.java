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
	 * With name.
	 *
	 * @param name the name
	 * @return the customer
	 */
	public CustomerBuilder withName(final String name) {
		customer.setName(name);
		return this;
	}

	/**
	 * With sex.
	 *
	 * @param sex the sex
	 * @return the customer
	 */
	public CustomerBuilder withSex(final String sex) {
		customer.setSex(sex);
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
