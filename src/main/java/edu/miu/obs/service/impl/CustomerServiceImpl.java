package edu.miu.obs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.miu.obs.dao.CustomerDao;
import edu.miu.obs.domain.Customer;
import edu.miu.obs.service.CustomerService;

/**
 * The Class CustomerServiceImpl.
 * 
 * @author Elias Rurangwa
 * @version 1.0
 */
@Transactional
@Service(CustomerService.NAME)
public class CustomerServiceImpl implements CustomerService {

	/** The customer dao. */
	@Autowired
	private CustomerDao customerDao;

	/**
	 * Find customer by name.
	 *
	 * @param name the name
	 * @return the customer
	 */
	@Override
	public Customer findCustomerByName(final String name) {

		return customerDao.findByName(name);
	}

	/**
	 * Creates the customer.
	 *
	 * @param customer the customer
	 */
	@Override
	public void saveCustomer(final Customer customer) {
		customerDao.save(customer);
	}

	/**
	 * Find all customers.
	 *
	 * @return the list
	 */
	@Override
	public List<Customer> findAllCustomers() {
		return customerDao.findAll();
	}

}
