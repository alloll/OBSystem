package edu.miu.obs.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import edu.miu.obs.validation.EmptyOrSize;

/**
 * The Class Person.
 * 
 * @author Elias Rurangwa
 * @version 1.0
 */
@Entity 
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Person extends DomainClass {
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The fisrt name. */
	@EmptyOrSize(min = 3, max = 50, message = "{EmptyOrSize}")
	@Column(name = "FIRST_NAME", length = 50, nullable = false)
	private String firstName;

	/** The last name. */
	@EmptyOrSize(min = 3, max = 50, message = "{EmptyOrSize}")
	@Column(name = "LAST_NAME", length = 50, nullable = false)
	private String lastName;

	/** The address. */
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "PERSON_ID")
	private List<Address> addresses;

	/** The Credentials. */
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "person_id")
	private Credentials Credentials;

	/** The email. */
	@Column(name = "EMAIL")
	private String email;

	/** The phone. */
	@Column(name = "PHONE")
	private String phone;



	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name.
	 *
	 * @param firstName the new first name
	 */
	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the credentials.
	 *
	 * @return the credentials
	 */
	public Credentials getCredentials() {
		return Credentials;
	}

	/**
	 * Sets the credentials.
	 *
	 * @param credentials the new credentials
	 */
	public void setCredentials(final Credentials credentials) {
		Credentials = credentials;
	}

	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name.
	 *
	 * @param lastName the new last name
	 */
	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(final String email) {
		this.email = email;
	}

	/**
	 * Gets the phone.
	 *
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * Sets the phone.
	 *
	 * @param phone the new phone
	 */
	public void setPhone(final String phone) {
		this.phone = phone;
	}

	/**
	 * Gets the addresses.
	 *
	 * @return the addresses
	 */
	public List<Address> getAddresses() {
		return addresses;
	}

	/**
	 * Sets the addresses.
	 *
	 * @param addresses the new addresses
	 */
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

}
