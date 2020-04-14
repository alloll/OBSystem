package edu.miu.obs.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The Class User.
 * @author Elias Rurangwa
 * @version 1.0
 */
@Entity
@Table(name = "USERS")
public class User extends Person {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

}
