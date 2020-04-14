package edu.miu.obs.dao.impl;

import org.springframework.stereotype.Repository;

import edu.miu.obs.dao.PaymentDao;
import edu.miu.obs.domain.Payment;

/**
 * The Class PaymentDaoImpl.
 * @author Elias
 * @version 1.0
 */
@Repository(PaymentDao.NAME)
public class PaymentDaoImpl extends GenericDaoImpl<Payment> implements PaymentDao {
	
	/**
	 * Instantiates a new payment dao impl.
	 */
	public PaymentDaoImpl() {
		super.setDaoType(Payment.class);
	}

}
