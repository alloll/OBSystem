package edu.miu.obs.dao;

import edu.miu.obs.domain.ESequenceType;
import edu.miu.obs.domain.SequenceNumber;

/**
 * The Interface SequenceNumberDao.
 * 
 * @author Elias Rurangwa
 * @version 1.0
 */
public interface SequenceNumberDao extends GenericDao<SequenceNumber> {

	/** The Constant NAME. */
	public static final String NAME = "sequenceNumberDao";

	/**
	 * The Class QUERY.
	 */
	public static class QUERY {

		/** The Constant findBySequenceType. */
		public static final String findBySequenceType = "select a from SequenceNumber a where a.type= :type and a.state= :state";
	}

	/**
	 * The Class QUERY_NAME.
	 */
	public static class QUERY_NAME {

		/** The Constant findBySequenceType. */
		public static final String findBySequenceType = "SequenceNumber.findBySequenceType";
	}


	/**
	 * Find next sequence type.
	 *
	 * @param sequenceType the sequence type
	 * @return the long
	 */
	public   Long findNextSequenceType(final ESequenceType sequenceType);
}
