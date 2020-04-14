package edu.miu.obs.dao.impl;

import org.springframework.stereotype.Repository;

import edu.miu.obs.dao.PaymentCardDao;
import edu.miu.obs.domain.PaymentCard;

/**
 * The Class PaymentCardDaoImpl.
 * 
 * @author Elias Rurangwa
 * @version 1.0
 */
@Repository(PaymentCardDao.NAME)
public class PaymentCardDaoImpl extends GenericDaoImpl<PaymentCard> implements PaymentCardDao {
	
	/**
	 * Instantiates a new payment card dao impl.
	 */
	public PaymentCardDaoImpl() {
		super.setDaoType(PaymentCard.class);
	}
}
