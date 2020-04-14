package edu.miu.obs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.miu.obs.dao.OrderDao;
import edu.miu.obs.domain.Order;
import edu.miu.obs.service.OrderService;

/**
 * The Class OrderServiceImpl.
 * 
 * @author Elias Rurangwa
 * @version 1.0
 */
@Transactional
@Service(OrderService.NAME)
public class OrderServiceImpl implements OrderService {

	/** The order dao. */
	@Autowired
	private OrderDao orderDao;

	/**
	 * Save order.
	 *
	 * @param order the order
	 */
	@Override
	public void saveOrder(final Order order) {
		if (order.isNew()) {
			String orderNumber = orderDao.getNextOrderNumber();
			order.setOrderNumber(orderNumber);
		}
		orderDao.save(order);
	}

}
