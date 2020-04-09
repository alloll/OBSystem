package edu.miu.obs.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.NotEmpty;

import edu.miu.obs.dao.CustomerDao;
import edu.miu.obs.validation.EmptyOrSize;

/**
 * The Class Customer.
 */
@Entity
@Table(name = "CUSTOMER")
@NamedQueries({ @NamedQuery(name = CustomerDao.QUERY_NAME.findByName, query = CustomerDao.QUERY.findByName),
		@NamedQuery(name = CustomerDao.QUERY_NAME.findByGender, query = CustomerDao.QUERY.findByGender) })
public class Customer extends DomainClass {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The name. */

	@EmptyOrSize(min = 3, max = 50, message = "{EmptyOrSize}")
	@Column(name = "NAME", length = 50, nullable = false)
	private String name;

	/** The sex. */
	@NotEmpty(message = "{NotEmpty}")
	@Column(name = "SEX", length = 10, nullable = false)
	private String sex;

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * Gets the sex.
	 *
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * Sets the sex.
	 *
	 * @param sex the new sex
	 */
	public void setSex(final String sex) {
		this.sex = sex;
	}

	/**
	 * Hash code.
	 *
	 * @return the int
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(getId()).toHashCode();
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
		if (!(obj instanceof Customer))
			return false;
		Customer other = (Customer) obj;
		return new EqualsBuilder().append(getId(), other.getId()).isEquals();

	}

}
