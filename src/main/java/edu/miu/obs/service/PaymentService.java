package edu.miu.obs.service;

import edu.miu.obs.domain.Payment;

/**
 * The Interface PaymentService.
 * @author Elias Rurangwa
 * @version 1.0
 */
public interface PaymentService {
	
	/** The Constant NAME. */
	public static final String NAME="paymentService";
	/**
	 * Save payment.
	 *
	 * @param payment the payment
	 */
	public void savePayment(final Payment payment);

}
