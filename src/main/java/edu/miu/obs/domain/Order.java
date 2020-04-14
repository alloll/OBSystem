package edu.miu.obs.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * The Class Order.
 * 
 * @author Elias Rurangwa
 * @version 1.0
 * 
 */
@Entity
@Table(name = "ORDER")
public class Order extends DomainClass {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The order date. */
	@Column(name = "ORDER_DATE")
	private LocalDate orderDate;

	/** The shipping date. */
	@Column(name = "SHIPPING_DATE")
	private LocalDate shippingDate;

	/** The shipping method. */
	@Column(name = "SHIPPING_METHOD")
	private String shippingMethod;


	/** The due date. */
	@Column(name = "DUE_DATE")
	private LocalDateTime dueDate;

	/** The order amount. */
	@Column(name = "ORDER_AMOUNT")
	private BigDecimal orderAmount = BigDecimal.ZERO;

	/** The order number. */
	@Column(name = "ORDER_NUMBER")
	private String orderNumber;
	
	/** The order status. */
	@Column(name="ORDER_STATUS")
	@Enumerated(EnumType.STRING)
	private EOrderStatus orderStatus=EOrderStatus.CREATED;

	/** The customer. */
	@OneToOne
	@JoinColumn(name = "CUSTOMER_ID")
	private Customer customer;

	/** The shipping address. */
	@OneToOne
	@JoinColumn(name = "SHIPPING_ADDRESS_ID")
	private Address shippingAddress;

	/** The address. */
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "ORDER_ID")
	private List<BookItem> bookItems;

	/**
	 * Gets the shipping address.
	 *
	 * @return the shipping address
	 */
	public Address getShippingAddress() {
		return shippingAddress;
	}

	/**
	 * Sets the shipping address.
	 *
	 * @param shippingAddress the new shipping address
	 */
	public void setShippingAddress(final Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	/**
	 * Gets the order date.
	 *
	 * @return the order date
	 */
	public LocalDate getOrderDate() {
		return orderDate;
	}

	/**
	 * Sets the order date.
	 *
	 * @param orderDate the new order date
	 */
	public void setOrderDate(final LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	/**
	 * Gets the shipping date.
	 *
	 * @return the shipping date
	 */
	public LocalDate getShippingDate() {
		return shippingDate;
	}

	/**
	 * Sets the shipping date.
	 *
	 * @param shippingDate the new shipping date
	 */
	public void setShippingDate(LocalDate shippingDate) {
		this.shippingDate = shippingDate;
	}

	/**
	 * Gets the shipping method.
	 *
	 * @return the shipping method
	 */
	public String getShippingMethod() {
		return shippingMethod;
	}

	/**
	 * Sets the shipping method.
	 *
	 * @param shippingMethod the new shipping method
	 */
	public void setShippingMethod(final String shippingMethod) {
		this.shippingMethod = shippingMethod;
	}

	/**
	 * Gets the due date.
	 *
	 * @return the due date
	 */
	public LocalDateTime getDueDate() {
		return dueDate;
	}

	/**
	 * Sets the due date.
	 *
	 * @param dueDate the new due date
	 */
	public void setDueDate(final LocalDateTime dueDate) {
		this.dueDate = dueDate;
	}

	/**
	 * Gets the order number.
	 *
	 * @return the order number
	 */
	public String getOrderNumber() {
		return orderNumber;
	}

	/**
	 * Sets the order number.
	 *
	 * @param orderNumber the new order number
	 */
	public void setOrderNumber(final String orderNumber) {
		this.orderNumber = orderNumber;
	}

	/**
	 * Gets the order amount.
	 *
	 * @return the order amount
	 */
	public BigDecimal getOrderAmount() {
		return orderAmount;
	}

	/**
	 * Sets the order amount.
	 *
	 * @param orderAmount the new order amount
	 */
	public void setOrderAmount(final BigDecimal orderAmount) {
		this.orderAmount = orderAmount;
	}

	
	/**
	 * Sets the order status.
	 *
	 * @param orderStatus the new order status
	 */
	public void setOrderStatus(final EOrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	/**
	 * Gets the customer.
	 *
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * Sets the customer.
	 *
	 * @param customer the new customer
	 */
	public void setCustomer(final Customer customer) {
		this.customer = customer;
	}

	/**
	 * Gets the book items.
	 *
	 * @return the book items
	 */
	public List<BookItem> getBookItems() {
		return bookItems;
	}

	/**
	 * Sets the book items.
	 *
	 * @param bookItems the new book items
	 */
	public void setBookItems(final List<BookItem> bookItems) {
		this.bookItems = bookItems;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(orderNumber).toHashCode();
	}

	/**
	 * Equals.
	 *
	 * @param obj the obj
	 * @return true, if successful
	 */
	@Override
	public boolean equals(final Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Order))
			return false;
		Order other = (Order) obj;
		return new EqualsBuilder().append(orderNumber, other.orderNumber).isEquals();

	}

}
