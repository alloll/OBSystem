package edu.miu.obs.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import edu.miu.obs.dao.SequenceNumberDao;

/**
 * The Class SequenceNumber.
 * @author Elias Ruranngwa
 * @version 1.0
 */
@Entity
@Table(name="SEQUENCE_NUMBER",uniqueConstraints = {
		@UniqueConstraint(columnNames = { "TYPE" }) })
@NamedQueries({
	@NamedQuery(name = SequenceNumberDao.QUERY_NAME.findBySequenceType, query = SequenceNumberDao.QUERY.findBySequenceType) })
public class SequenceNumber  extends DomainClass{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	/** The sequence. */
	@NotNull
	@Column(name = "SEQUENCE", nullable = false)
	private Long sequence; 
 	/** The type. */
 	@Column(name="TYPE",nullable = false)
 	@Enumerated(EnumType.STRING)
	private ESequenceType type;
	
	/**
	 * Gets the sequence.
	 *
	 * @return the sequence
	 */
	public Long getSequence() {
		return sequence;
	}
	
	/**
	 * Sets the sequence.
	 *
	 * @param sequence the new sequence
	 */
	public void setSequence(final Long sequence) {
		this.sequence = sequence;
	}
	
	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public ESequenceType getType() {
		return type;
	}
	
	/**
	 * Sets the type.
	 *
	 * @param type the new type
	 */
	public void setType(final ESequenceType type) {
		this.type = type;
	}
 	
 	

}
