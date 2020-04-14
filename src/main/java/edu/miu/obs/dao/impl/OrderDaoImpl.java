package edu.miu.obs.dao.impl;

import org.springframework.stereotype.Repository;

import edu.miu.obs.dao.OrderDao;
import edu.miu.obs.domain.Order;

/**
 * The Class OrderDaoImpl.
 * 
 * @author Elias Rurangwa
 * @version 1.0
 */
@Repository(OrderDao.NAME)
public class OrderDaoImpl extends GenericDaoImpl<Order> implements OrderDao {

	public OrderDaoImpl() {
		super.setDaoType(Order.class);
	}

}
