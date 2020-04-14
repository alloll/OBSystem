package edu.miu.obs.dao;

import edu.miu.obs.domain.Payment;

/**
 * The Interface PaymentDao.
 * 
 * @author Elias Rurangwa
 * @version 1.0
 */
public interface PaymentDao extends GenericDao<Payment> {

	/** The Constant NAME. */
	public static final String NAME = "paymentDao";
	
	/**
	 * Gets the next payment.
	 *
	 * @return the next payment
	 */
	public String getNextPaymentNumber();

}
