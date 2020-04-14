package edu.miu.obs.service;

import java.util.List;

import edu.miu.obs.domain.Customer;

/**
 * The Interface CustomerService.
 * 
 * @author Elias Rurangwa
 * @version 1.0
 */
public interface CustomerService {

	/** The Constant NAME. */
	public static final String NAME = "CustomerService";

	/**
	 * Find customer by name.
	 *
	 * @param name the name
	 * @return the customer
	 */
	public Customer findCustomerByName(final String name);


	public void saveCustomer(final Customer customer);

	/**
	 * Find all customers.
	 *
	 * @return the list
	 */
	public List<Customer> findAllCustomers();

}
