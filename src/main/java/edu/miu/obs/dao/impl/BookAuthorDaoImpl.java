package edu.miu.obs.dao.impl;

import org.springframework.stereotype.Repository;

import edu.miu.obs.dao.BookAuthorDao;
import edu.miu.obs.domain.BookAuthor;

/**
 * The Class BookAuthorDaoImpl.
 * 
 * @author Elias Rurangwa
 * @version 1.0
 */
@Repository(BookAuthorDao.NAME)
public class BookAuthorDaoImpl extends GenericDaoImpl<BookAuthor> implements BookAuthorDao {

	/**
	 * Instantiates a new book author dao impl.
	 */
	public BookAuthorDaoImpl() {

		super.setDaoType(BookAuthor.class);
	}

}
