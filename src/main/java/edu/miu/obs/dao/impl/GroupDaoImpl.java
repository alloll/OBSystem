package edu.miu.obs.dao.impl;

import org.springframework.stereotype.Repository;

import edu.miu.obs.dao.GroupDao;
import edu.miu.obs.domain.Group;

/**
 * The Class GroupDaoImpl.
 * 
 * @author Elias Rurangwa
 * @version 1.0
 */
@Repository(GroupDao.NAME)
public class GroupDaoImpl extends GenericDaoImpl<Group> implements GroupDao {

	/**
	 * Instantiates a new group dao impl.
	 */
	public GroupDaoImpl() {
		this.setDaoType(Group.class);
	}
}
