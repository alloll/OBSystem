package edu.miu.obs.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * The Class Payment.
 */
@Entity
@Table(name = "PAYMENT")
public class Payment extends DomainClass {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The amount. */
	@Column(name = "AMOUNT")
	private BigDecimal amount = BigDecimal.ZERO;

	/** The payment number. */
	@Column(name = "payment_number")
	private String payment_number;

	/** The due date. */
	@Column(name = "DUE_DATE")
	private LocalDate dueDate;

	/** The payment status. */
	@Column(name = "PAYMENT_STATUS")
	@Enumerated(EnumType.STRING)
	private EPaymentStatus paymentStatus=EPaymentStatus.CREATED;

	/** The payment card. */
	@JoinColumn(name = "PAYMENT_CARD_ID")
	private PaymentCard paymentCard;

	/** The order. */
	@OneToOne
	@JoinColumn(name = "ORDER_ID")
	private Order order;

	/**
	 * Gets the amount.
	 *
	 * @return the amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * Sets the amount.
	 *
	 * @param amount the new amount
	 */
	public void setAmount(final BigDecimal amount) {
		this.amount = amount;
	}

	/**
	 * Gets the due date.
	 *
	 * @return the due date
	 */
	public LocalDate getDueDate() {
		return dueDate;
	}

	/**
	 * Sets the due date.
	 *
	 * @param dueDate the new due date
	 */
	public void setDueDate(final LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	/**
	 * Gets the payment card.
	 *
	 * @return the payment card
	 */
	public PaymentCard getPaymentCard() {
		return paymentCard;
	}

	/**
	 * Sets the payment card.
	 *
	 * @param paymentCard the new payment card
	 */
	public void setPaymentCard(final PaymentCard paymentCard) {
		this.paymentCard = paymentCard;
	}

	/**
	 * Gets the payment number.
	 *
	 * @return the payment number
	 */
	public String getPayment_number() {
		return payment_number;
	}

	/**
	 * Sets the payment number.
	 *
	 * @param payment_number the new payment number
	 */
	public void setPayment_number(final String payment_number) {
		this.payment_number = payment_number;
	}

	/**
	 * Gets the order.
	 *
	 * @return the order
	 */
	public Order getOrder() {
		return order;
	}

	/**
	 * Sets the order.
	 *
	 * @param order the new order
	 */
	public void setOrder(final Order order) {
		this.order = order;
	}

	
	
	/**
	 * Gets the payment status.
	 *
	 * @return the payment status
	 */
	public EPaymentStatus getPaymentStatus() {
		return paymentStatus;
	}

	/**
	 * Sets the payment status.
	 *
	 * @param paymentStatus the new payment status
	 */
	public void setPaymentStatus(final EPaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(payment_number).toHashCode();
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
		if (!(obj instanceof Payment))
			return false;
		Payment other = (Payment) obj;
		return new EqualsBuilder().append(payment_number, other.payment_number).isEquals();

	}

}
