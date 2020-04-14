package edu.miu.obs.dao;

import edu.miu.obs.domain.Order;

/**
 * The Interface OrderDao.
 * @author Elias Rurangwa
 */
public interface OrderDao extends GenericDao<Order> {
	
	/** The Constant NAME. */
	public static final String NAME="orderDao";
	
	/**
	 * Gets the next order number.
	 *
	 * @return the next order number
	 */
	public  String getNextOrderNumber();

}
