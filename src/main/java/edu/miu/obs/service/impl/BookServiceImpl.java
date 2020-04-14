package edu.miu.obs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.miu.obs.dao.BookDao;
import edu.miu.obs.domain.Book;
import edu.miu.obs.service.BookService;

/**
 * The Class BookServiceImpl.
 * 
 * @author Elias Rurangwa
 */
@Service(BookService.NAME)
public class BookServiceImpl implements BookService {
	@Autowired
	private BookDao bookDao;

	/**
	 * Save book.
	 *
	 * @param book the book
	 */
	@Override
	public void saveBook(Book book) {
		bookDao.save(book);

	}

}
