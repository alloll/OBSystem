package edu.miu.obs.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The Class BookAuthor.
 * @author Elias Rurangwa
 * @version 1.0
 */
@Entity
@Table(name = "BOOK_ATHOR")
public class BookAuthor extends Person {
	private static final long serialVersionUID = 1L;

}
