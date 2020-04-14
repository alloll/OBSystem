package edu.miu.obs.dao.impl;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import edu.miu.obs.constant.DaoParameter;
import edu.miu.obs.dao.SequenceNumberDao;
import edu.miu.obs.domain.ELifeCycle;
import edu.miu.obs.domain.ESequenceType;
import edu.miu.obs.domain.SequenceNumber;

/**
 * The Class SequenceNumberDaoImpl.
 * 
 * @author Elias Rurangwa
 * @version 1.0
 */
@Repository(SequenceNumberDao.NAME)
public class SequenceNumberDaoImpl extends GenericDaoImpl<SequenceNumber> implements SequenceNumberDao {

	/**
	 * Instantiates a new sequence number dao impl.
	 */
	public SequenceNumberDaoImpl() {
		super.setDaoType(SequenceNumber.class);
	}

	/**
	 * Find next sequence type.
	 *
	 * @param sequenceType the sequence type
	 * @return the long
	 */
	@Override
	public Long findNextSequenceType(final ESequenceType sequenceType) {
		Query query = entityManager.createNamedQuery(SequenceNumberDao.QUERY_NAME.findBySequenceType);
		query.setParameter(DaoParameter.STATE, ELifeCycle.ACTIVE).setParameter(DaoParameter.TYPE, sequenceType);

		try {
			SequenceNumber sequence = (SequenceNumber) query.getSingleResult();
			sequence.setSequence(sequence.getSequence() + Long.valueOf((1)));
			this.update(sequence);
			return sequence.getSequence();
		} catch (Exception ex) {

			// That means we do not have any sequence, we need to create one
			SequenceNumber sequence = new SequenceNumber();
			sequence.setType(sequenceType);
			sequence.setSequence(Long.valueOf((1)));
			// create the sequence
			this.save(sequence);
			return sequence.getSequence();

		}
	}
}
