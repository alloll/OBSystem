package edu.miu.obs.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * The Class Group.
 */
@Entity
@Table(name = "GROUP_TOO")
public class Group extends DomainClass {

	private static final long serialVersionUID = 1L;

	/** The Name. */
	private String Name;

	/** The user credentials. */
	@ManyToMany(fetch = FetchType.EAGER)
	List<Credentials> userCredentials = new ArrayList<Credentials>();

	/** The authority. */
//	@ManyToMany(fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
//	List<Authority> authority = new ArrayList<Authority>();

	public String getName() {
		return Name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(final String name) {
		Name = name;
	}

	/**
	 * Gets the user credentials.
	 *
	 * @return the user credentials
	 */
	public List<Credentials> getUserCredentials() {
		return userCredentials;
	}

	/**
	 * Sets the user credentials.
	 *
	 * @param userCredentials the new user credentials
	 */
	public void setUserCredentials(final List<Credentials> userCredentials) {
		this.userCredentials = userCredentials;
	}

//	/**
//	 * Gets the authority.
//	 *
//	 * @return the authority
//	 */
//	public List<Authority> getAuthority() {
//		return authority;
//	}
//
//	/**
//	 * Sets the authority.
//	 *
//	 * @param authority the new authority
//	 */
//	public void setAuthority(final List<Authority> authority) {
//		this.authority = authority;
//	}

}
