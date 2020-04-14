package edu.miu.obs.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.miu.obs.dao.OrderDao;
import edu.miu.obs.dao.SequenceNumberDao;
import edu.miu.obs.domain.ESequenceType;
import edu.miu.obs.domain.Order;

/**
 * The Class OrderDaoImpl.
 * 
 * @author Elias Rurangwa
 * @version 1.0
 */
@Repository(OrderDao.NAME)
public class OrderDaoImpl extends GenericDaoImpl<Order> implements OrderDao {

	/** The sequence number dao. */
	@Autowired
	private SequenceNumberDao sequenceNumberDao;
	
	/**
	 * Instantiates a new order dao impl.
	 */
	public OrderDaoImpl() {
		super.setDaoType(Order.class);
	}

	/**
	 * Gets the next order number.
	 *
	 * @return the next order number
	 */
	@Override
	public String getNextOrderNumber() {
		// TODO Auto-generated method stub
		return "ORD"+sequenceNumberDao.findNextSequenceType(ESequenceType.ORDER);
	}
	

}
