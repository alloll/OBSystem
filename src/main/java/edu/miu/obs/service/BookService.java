package edu.miu.obs.service;

import edu.miu.obs.domain.Book;

/**
 * The Interface BookService.
 * @author Elias Rurangwa
 * @version 1.0
 */
public interface BookService {
	
	/** The Constant NAME. */
	public static final String NAME="bookService";
	
	/**
	 * Save book.
	 *
	 * @param book the book
	 */
	public void saveBook(final Book book);

}
