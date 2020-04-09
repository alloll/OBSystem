package edu.miu.obs.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import edu.miu.obs.constant.DaoParameter;
import edu.miu.obs.dao.CustomerDao;
import edu.miu.obs.domain.Customer;
import edu.miu.obs.domain.ELifeCycle;

/**
 * The Class CustomerDaoImpl.
 * 
 * @author Elias Rurangwa
 * @version 1.0
 */
@Repository(CustomerDao.NAME)
public class CustomerDaoImpl extends GenericDaoImpl<Customer> implements CustomerDao {

	/**
	 * Instantiates a new customer dao impl.
	 */
	public CustomerDaoImpl() {
		super.setDaoType(Customer.class);
	}

	/**
	 * Find by name.
	 *
	 * @param name the name
	 * @return the customer
	 */
	@Override
	public Customer findByName(final String name) {
		Query query = entityManager.createNamedQuery(CustomerDao.QUERY_NAME.findByName);
		query.setParameter(DaoParameter.NAME, name);
		query.setParameter(DaoParameter.STATE, ELifeCycle.ACTIVE);
		return (Customer) query.getSingleResult();
	}

	/**
	 * Find by gender.
	 *
	 * @param sex the sex
	 * @return the list
	 */
	public List<Customer> findByGender(final String sex) {
		Query query = entityManager.createNamedQuery(CustomerDao.QUERY_NAME.findByGender);
		query.setParameter(DaoParameter.SEX, sex);
		query.setParameter(DaoParameter.STATE, ELifeCycle.ACTIVE);
		return (List<Customer>) query.getResultList();
	}

}
