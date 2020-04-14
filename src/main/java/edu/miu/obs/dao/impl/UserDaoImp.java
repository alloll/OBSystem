package edu.miu.obs.dao.impl;

import org.springframework.stereotype.Repository;

import edu.miu.obs.dao.UserDao;
import edu.miu.obs.domain.User;

/**
 * The Class UserDaoImp.
 * 
 * @author Elias Rurangwa
 * @version 1.0
 */
@Repository(UserDao.NAME)
public class UserDaoImp extends GenericDaoImpl<User> implements UserDao {

	/**
	 * Instantiates a new user dao imp.
	 */
	public UserDaoImp() {
		super.setDaoType(User.class);
	}

}
