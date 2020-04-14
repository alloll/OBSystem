package edu.miu.obs.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * The Class BookItem.
 * 
 * @author Elias Rurangwa
 */
@Entity
@Table(name = "BOOK_ITEM")
public class BookItem extends DomainClass {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The quantity. */
	@Column(name = "QUANTITY")
	private BigDecimal quantity = BigDecimal.ZERO;

	/** The subtotal. */
	@Column(name = "SUBTOTAL")
	private BigDecimal subtotal = BigDecimal.ZERO;

	/** The book. */
	@OneToOne
	@JoinColumn(name = "BOOK_ID")
	private Book book;

	/**
	 * Gets the quantity.
	 *
	 * @return the quantity
	 */
	public BigDecimal getQuantity() {
		return quantity;
	}

	/**
	 * Sets the quantity.
	 *
	 * @param quantity the new quantity
	 */
	public void setQuantity(final BigDecimal quantity) {
		this.quantity = quantity;
	}

	/**
	 * Gets the subtotal.
	 *
	 * @return the subtotal
	 */
	public BigDecimal getSubtotal() {
		return subtotal;
	}

	/**
	 * Sets the subtotal.
	 *
	 * @param subtotal the new subtotal
	 */
	public void setSubtotal(final BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	/**
	 * Gets the book.
	 *
	 * @return the book
	 */
	public Book getBook() {
		return book;
	}

	/**
	 * Sets the book.
	 *
	 * @param book the new book
	 */
	public void setBook(final Book book) {
		this.book = book;
	}

}
