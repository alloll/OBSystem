package edu.miu.obs.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * The Class Address.
 * 
 * @author Elias Rurangwa
 * @version 1.0
 */
@Entity
@Table(name = "ADDRESS")
public class Address extends DomainClass {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The street. */
	@Column(name = "STREET")
	private String street;

	/** The city. */
	@Column(name = "CITY")
	private String city;

	/** The post code. */
	@Column(name = "POST_CODE")
	private String postCode;

	/** The country. */
	@Column(name = "COUNTRY")
	private String country;

	/**
	 * Gets the street.
	 *
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * Sets the street.
	 *
	 * @param street the new street
	 */
	public void setStreet(final String street) {
		this.street = street;
	}

	/**
	 * Gets the city.
	 *
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the city.
	 *
	 * @param city the new city
	 */
	public void setCity(final String city) {
		this.city = city;
	}

	/**
	 * Gets the post code.
	 *
	 * @return the post code
	 */
	public String getPostCode() {
		return postCode;
	}

	/**
	 * Sets the post code.
	 *
	 * @param postCode the new post code
	 */
	public void setPostCode(final String postCode) {
		this.postCode = postCode;
	}

	/**
	 * Gets the country.
	 *
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * Sets the country.
	 *
	 * @param country the new country
	 */
	public void setCountry(final String country) {
		this.country = country;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(street).append(country).append(city).append(postCode).toHashCode();
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
		if (!(obj instanceof Address))
			return false;
		Address other = (Address) obj;
		return new EqualsBuilder().append(street, other.street).append(country, other.country)
				.append(postCode, other.postCode).append(city, other.city).isEquals();

	}

}
