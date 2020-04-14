package edu.miu.obs.service;

import edu.miu.obs.domain.Order;

/**
 * The Interface OrderService.
 * @author Elias Rurangwa
 * @version 1.0
 */
public interface OrderService {
	
	/** The Constant NAME. */
	public static final String NAME="orderService";
	/**
	 * Save order.
	 *
	 * @param order the order
	 */
	public void saveOrder(final Order order);

}
