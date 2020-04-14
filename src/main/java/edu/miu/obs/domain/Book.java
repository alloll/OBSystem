package edu.miu.obs.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

/**
 * The Class Book.
 * 
 * @author Elias Rurangwa
 * @version 1.0
 * 
 */
@Entity
@Table(name = "BOOK")
public class Book extends DomainClass {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The title. */
	@Column(name = "TITLE")
	private String title;

	/** The publisher. */
	@Column(name = "PUBLISHER")
	private String publisher;

	/** The pubishing date. */
	@Column(name = "PUBLISHING_DATE)")
	private LocalDate publishingDate;

	/** The language. */
	@Column(name = "LANGUAGE")
	private String language;

	/** The category. */
	@Column(name = "CATEGORY")
	private String category;

	/** The format. */
	@Column(name = "FORMAT")
	private String format;

	/** The isbn. */
	@Column(name = "ISBN")
	private String isbn;

	/** The shipping weight. */
	@Column(name = "SHIPPING_WEIGHT")
	private BigDecimal shippingWeight = BigDecimal.ZERO;

	/** The list price. */
	@Column(name = "LIST_PRICE")
	private BigDecimal listPrice = BigDecimal.ZERO;

	/** The out price. */
	@Column(name = "OUT_PRICE")
	private BigDecimal outPrice = BigDecimal.ZERO;

	/** The number of page. */
	@Column(name = "NUMBER_OF_PAGE")
	private int numberOfPage = 0;
	
	/** The book author. */
	@JoinColumn(name="BOOK_AUTHOR_ID")
	private BookAuthor bookAuthor;

	/**
	 * Gets the title.
	 *
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the title.
	 *
	 * @param title the new title
	 */
	public void setTitle(final String title) {
		this.title = title;
	}

	/**
	 * Gets the publisher.
	 *
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}

	/**
	 * Sets the publisher.
	 *
	 * @param publisher the new publisher
	 */
	public void setPublisher(final String publisher) {
		this.publisher = publisher;
	}

	/**
	 * Gets the publishing date.
	 *
	 * @return the publishing date
	 */
	public LocalDate getPublishingDate() {
		return publishingDate;
	}

	/**
	 * Sets the publishing date.
	 *
	 * @param publishingDate the new publishing date
	 */
	public void setPublishingDate(final LocalDate publishingDate) {
		this.publishingDate = publishingDate;
	}

	/**
	 * Gets the language.
	 *
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * Sets the language.
	 *
	 * @param language the new language
	 */
	public void setLanguage(final String language) {
		this.language = language;
	}

	/**
	 * Gets the category.
	 *
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * Sets the category.
	 *
	 * @param category the new category
	 */
	public void setCategory(final String category) {
		this.category = category;
	}

	/**
	 * Gets the format.
	 *
	 * @return the format
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * Sets the format.
	 *
	 * @param format the new format
	 */
	public void setFormat(final String format) {
		this.format = format;
	}

	/**
	 * Gets the isbn.
	 *
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * Sets the isbn.
	 *
	 * @param isbn the new isbn
	 */
	public void setIsbn(final String isbn) {
		this.isbn = isbn;
	}

	/**
	 * Gets the shipping weight.
	 *
	 * @return the shipping weight
	 */
	public BigDecimal getShippingWeight() {
		return shippingWeight;
	}

	/**
	 * Sets the shipping weight.
	 *
	 * @param shippingWeight the new shipping weight
	 */
	public void setShippingWeight(final BigDecimal shippingWeight) {
		this.shippingWeight = shippingWeight;
	}

	/**
	 * Gets the list price.
	 *
	 * @return the list price
	 */
	public BigDecimal getListPrice() {
		return listPrice;
	}

	/**
	 * Sets the list price.
	 *
	 * @param listPrice the new list price
	 */
	public void setListPrice(final BigDecimal listPrice) {
		this.listPrice = listPrice;
	}

	/**
	 * Gets the out price.
	 *
	 * @return the out price
	 */
	public BigDecimal getOutPrice() {
		return outPrice;
	}

	/**
	 * Sets the out price.
	 *
	 * @param outPrice the new out price
	 */
	public void setOutPrice(final BigDecimal outPrice) {
		this.outPrice = outPrice;
	}

	/**
	 * Gets the number of page.
	 *
	 * @return the number of page
	 */
	public int getNumberOfPage() {
		return numberOfPage;
	}

	/**
	 * Sets the number of page.
	 *
	 * @param numberOfPage the new number of page
	 */
	public void setNumberOfPage(final int numberOfPage) {
		this.numberOfPage = numberOfPage;
	}

	/**
	 * Gets the book author.
	 *
	 * @return the book author
	 */
	public BookAuthor getBookAuthor() {
		return bookAuthor;
	}

	/**
	 * Sets the book author.
	 *
	 * @param bookAuthor the new book author
	 */
	public void setBookAuthor(final BookAuthor bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
	

}
