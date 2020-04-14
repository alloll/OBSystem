package edu.miu.obs.dao.impl;

import org.springframework.stereotype.Repository;

import edu.miu.obs.dao.BookItemDao;
import edu.miu.obs.domain.BookItem;

/**
 * The Class BookItemDaoImpl.
 * 
 * @author Elias Rurangwa
 * @version 1.0
 */
@Repository(BookItemDao.NAME)
public class BookItemDaoImpl extends GenericDaoImpl<BookItem> implements BookItemDao {

	public BookItemDaoImpl() {
		super.setDaoType(BookItem.class);
	}
}
