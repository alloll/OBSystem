package edu.miu.obs.domain;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import edu.miu.obs.dao.CustomerDao;

/**
 * The Class Customer.
 */
@Entity
@Table(name = "CUSTOMER")
@NamedQueries({ @NamedQuery(name = CustomerDao.QUERY_NAME.findByName, query = CustomerDao.QUERY.findByName),
		@NamedQuery(name = CustomerDao.QUERY_NAME.findByGender, query = CustomerDao.QUERY.findByGender) })
public class Customer extends Person {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

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
