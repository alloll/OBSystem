package edu.miu.obs.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * The Class PaymentCard.
 * 
 * @author Elias Rurangwa
 * @version 1.0
 */
@Entity
@Table(name = "PAYMENT_CARD")
public class PaymentCard extends DomainClass {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The card name. */
	@Column(name = "CARD_NAME")
	private String cardName;

	/** The type. */
	@Column(name = "TYPE")
	@Enumerated(EnumType.STRING)
	private ECardType type;

	/** The card number. */
	@Column(name = "CARD_NUMBER")
	private String cardNumber;

	/** The expiration month. */
	@Column(name = "EXPIRATION_MONTH")
	private int expirationMonth;

	/** The expiration year. */
	@Column(name = "EXPIRATION_YEAR")
	private int expirationYear;

	/** The cvc. */
	@Column(name = "CVC")
	private int cvc;

	/** The holder name. */
	private String holderName;

	/**
	 * Gets the card name.
	 *
	 * @return the card name
	 */
	public String getCardName() {
		return cardName;
	}

	/**
	 * Sets the card name.
	 *
	 * @param cardName the new card name
	 */
	public void setCardName(final String cardName) {
		this.cardName = cardName;
	}

	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public ECardType getType() {
		return type;
	}

	/**
	 * Sets the type.
	 *
	 * @param type the new type
	 */
	public void setType(final ECardType type) {
		this.type = type;
	}

	/**
	 * Gets the card number.
	 *
	 * @return the card number
	 */
	public String getCardNumber() {
		return cardNumber;
	}

	/**
	 * Sets the card number.
	 *
	 * @param cardNumber the new card number
	 */
	public void setCardNumber(final String cardNumber) {
		this.cardNumber = cardNumber;
	}

	/**
	 * Gets the expiration month.
	 *
	 * @return the expiration month
	 */
	public int getExpirationMonth() {
		return expirationMonth;
	}

	/**
	 * Sets the expiration month.
	 *
	 * @param expirationMonth the new expiration month
	 */
	public void setExpirationMonth(final int expirationMonth) {
		this.expirationMonth = expirationMonth;
	}

	/**
	 * Gets the expiration year.
	 *
	 * @return the expiration year
	 */
	public int getExpirationYear() {
		return expirationYear;
	}

	/**
	 * Sets the expiration year.
	 *
	 * @param expirationYear the new expiration year
	 */
	public void setExpirationYear(final int expirationYear) {
		this.expirationYear = expirationYear;
	}

	/**
	 * Gets the cvc.
	 *
	 * @return the cvc
	 */
	public int getCvc() {
		return cvc;
	}

	/**
	 * Sets the cvc.
	 *
	 * @param cvc the new cvc
	 */
	public void setCvc(final int cvc) {
		this.cvc = cvc;
	}

	/**
	 * Gets the holder name.
	 *
	 * @return the holder name
	 */
	public String getHolderName() {
		return holderName;
	}

	/**
	 * Sets the holder name.
	 *
	 * @param holderName the new holder name
	 */
	public void setHolderName(final String holderName) {
		this.holderName = holderName;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(cardNumber).toHashCode();
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
		if (!(obj instanceof PaymentCard))
			return false;
		PaymentCard other = (PaymentCard) obj;
		return new EqualsBuilder().append(cardNumber, other.cardNumber).isEquals();

	}

}
