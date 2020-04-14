package edu.miu.obs.dao;

import java.util.List;

import edu.miu.obs.domain.Customer;

/**
 * The Interface MemberDao.
 * 
 * @author Elias Rurangwa
 * @version 1.0
 */
public interface CustomerDao extends GenericDao<Customer> {

	/** The Constant NAME. */
	public static final String NAME = "customerDao";

	/**
	 * The Class QUERY.
	 */
	public static class QUERY {

		/** The Constant findByName. */
		public static final String findByName = "select a from Customer a where  a.name= :name and a.state= :state";

		/** The Constant findByGender. */
		public static final String findByGender = "select a from Customer a where a.sex= :sex and a.state= :state";
	}

	/**
	 * The Class QUERY_NAME.
	 */
	public static class QUERY_NAME {

		/** The Constant findByName. */
		public static final String findByName = "Customer.findByName";

		/** The Constant findByGender. */
		public static final String findByGender = "Customer.findByGender";

	}

	/**
	 * Find by name.
	 *
	 * @param name the name
	 * @return the customer
	 */
	public Customer findByName(final String name);

	/**
	 * Find by gender.
	 *
	 * @param sex the sex
	 * @return the list
	 */
	public List<Customer> findByGender(final String sex);

}
