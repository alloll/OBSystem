package edu.miu.obs.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

/**
 * The Class DomainClass.
 * 
 * @author Elias Rurangwa
 * @version 1.0
 */
//@DynamicInsert(value = true)
//@DynamicUpdate(value = true)
@MappedSuperclass
public class DomainClass implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	/** The version. */
	@Column(name = "VERSION")
	@Version
	private int version;

	/** The id. */
	@Column(name = "ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	/** The state. */
	@Column(name = "STATE")
	@Enumerated(EnumType.ORDINAL)
	private ELifeCycle state = ELifeCycle.ACTIVE;

	/**
	 * Gets the version.
	 *
	 * @return the version
	 */
	public int getVersion() {
		return version;
	}

	/**
	 * Sets the version.
	 *
	 * @param version the new version
	 */
	public void setVersion(final int version) {
		this.version = version;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * Gets the state.
	 *
	 * @return the state
	 */
	public ELifeCycle getState() {
		return state;
	}

	/**
	 * Sets the state.
	 *
	 * @param state the new state
	 */
	public void setState(final ELifeCycle state) {
		this.state = state;
	}

	/**
	 * Sets the id.
	 *
	 * @param iD the new id
	 */
	public void setId(final Long id) {
		this.id = id;
	}

	/**
	 * Checks if is new.
	 *
	 * @return true, if is new
	 */
	public boolean isNew() {
		if (id == null) {
			return true;
		}
		return false;
	}

}
