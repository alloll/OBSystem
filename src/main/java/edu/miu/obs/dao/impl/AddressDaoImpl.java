package edu.miu.obs.dao.impl;

import org.springframework.stereotype.Repository;

import edu.miu.obs.dao.AddressDao;
import edu.miu.obs.domain.Address;

/**
 * The Class AddressDaoImpl.
 * 
 * @author Elias Rurangwa
 * @version 1.0
 */
@Repository(AddressDao.NAME)
public class AddressDaoImpl extends GenericDaoImpl<Address> implements AddressDao {

	/**
	 * Instantiates a new address dao impl.
	 */
	public AddressDaoImpl() {
		super.setDaoType(Address.class);
	}

}
