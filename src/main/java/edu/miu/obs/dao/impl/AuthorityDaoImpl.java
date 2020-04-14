package edu.miu.obs.dao.impl;

import org.springframework.stereotype.Repository;

import edu.miu.obs.dao.AuthorityDao;
import edu.miu.obs.domain.Authority;

/**
 * The Class AuthorityDaoImpl.
 * 
 * @author Elias Rurangwa
 * @version 1.0
 *
 */
@Repository(AuthorityDao.NAME)
public class AuthorityDaoImpl extends GenericDaoImpl<Authority> implements AuthorityDao {

	/**
	 * Instantiates a new authority dao impl.
	 */
	public AuthorityDaoImpl() {
		this.setDaoType(Authority.class);
	}
}
