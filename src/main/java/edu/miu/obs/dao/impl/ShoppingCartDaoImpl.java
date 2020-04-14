package edu.miu.obs.dao.impl;

import org.springframework.stereotype.Repository;

import edu.miu.obs.dao.ShoppingCartDao;
import edu.miu.obs.domain.ShoppingCart;

/**
 * The Class ShoppingCartDaoImpl.
 * 
 * @author Elias Rurangwa
 * @version 1.0
 */
@Repository(ShoppingCartDao.NAME)
public class ShoppingCartDaoImpl extends GenericDaoImpl<ShoppingCart> implements ShoppingCartDao {

	/**
	 * Instantiates a new shopping cart dao impl.
	 */
	public ShoppingCartDaoImpl() {
		this.setDaoType(ShoppingCart.class);
	}
}
