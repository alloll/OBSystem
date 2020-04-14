package edu.miu.obs.dao.impl;

import org.springframework.stereotype.Repository;

import edu.miu.obs.dao.BookDao;
import edu.miu.obs.domain.Book;

/**
 * The Class BookDaoImpl.
 * 
 * @author Elias Rurangwa
 * @version 1.0
 */
@Repository(BookDao.NAME)
public class BookDaoImpl extends GenericDaoImpl<Book> implements BookDao {

	/**
	 * Instantiates a new book dao impl.
	 */
	public BookDaoImpl() {
		super.setDaoType(Book.class);
	}

}
