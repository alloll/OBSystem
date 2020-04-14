package edu.miu.obs.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The Class Authority.
 * @author Elias Rurangwa
 * @version 1.0
 */
@Entity
@Table(name = "Authority")
public class Authority  extends DomainClass{

	private static final long serialVersionUID = 1L;
	/** The authority. */
	@Column(name="authority")
	private String authority;

}
