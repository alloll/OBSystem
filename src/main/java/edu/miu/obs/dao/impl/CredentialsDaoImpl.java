package edu.miu.obs.dao.impl;

import org.springframework.stereotype.Repository;

import edu.miu.obs.dao.CredentialsDao;
import edu.miu.obs.domain.Credentials;

/**
 * The Class CredentialsDaoImpl.
 * 
 * @author Elias Rurangwa
 * @version 1.0
 */
@Repository(CredentialsDao.NAME)
public class CredentialsDaoImpl extends GenericDaoImpl<Credentials> implements CredentialsDao {
	
	/**
	 * Instantiates a new credentials dao impl.
	 */
	public CredentialsDaoImpl() {
		this.setDaoType(Credentials.class);
	}
}
