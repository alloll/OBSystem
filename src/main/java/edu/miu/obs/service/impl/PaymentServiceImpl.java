package edu.miu.obs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.miu.obs.dao.PaymentDao;
import edu.miu.obs.domain.Payment;
import edu.miu.obs.service.PaymentService;

/**
 * The Class PaymentServiceImpl.
 * 
 * @author Elias Rurangwa
 * @version 1.0
 */
@Transactional
@Service(PaymentService.NAME)
public class PaymentServiceImpl implements PaymentService {

	/** The payment dao. */
	@Autowired
	private PaymentDao paymentDao;

	/**
	 * Save payment.
	 *
	 * @param payment the payment
	 */
	@Override
	public void savePayment(final Payment payment) {

		if (payment.isNew()) {
			String paymentNumber = paymentDao.getNextPaymentNumber();
			payment.setPayment_number(paymentNumber);
		}

		paymentDao.save(payment);
	}

}
