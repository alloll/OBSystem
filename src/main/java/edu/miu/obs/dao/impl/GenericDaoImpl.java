package edu.miu.obs.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.miu.obs.dao.GenericDao;

/**
 * The Class GenericDaoImpl.
 * 
 * @author Elias Rurangwa
 * @version 1.0
 *
 * @param <T> the generic type
 */
public abstract class GenericDaoImpl<T> implements GenericDao<T> {

	/** The entity manager. */
	@PersistenceContext
	protected EntityManager entityManager;

	/** The dao type. */
	protected Class<T> daoType;

	/**
	 * Sets the dao type.
	 *
	 * @param type the new dao type
	 */
	public void setDaoType(Class<T> type) {
		daoType = type;
	}

	/**
	 * Save.
	 *
	 * @param entity the entity
	 */
	@Override
	public void save(T entity) {
		entityManager.persist(entity);
	}

	/**
	 * Delete.
	 *
	 * @param entity the entity
	 */
	public void delete(T entity) {
		entityManager.remove(entity);
	}

	/**
	 * Delete.
	 *
	 * @param id the id
	 */
	@Override
	public void delete(Long id) {
		T entity = findOne(id);
		delete(entity);
	}

	/**
	 * Find one.
	 *
	 * @param id the id
	 * @return the t
	 */
	@Override
	public T findOne(Long id) {
		return (T) entityManager.find(daoType, id);
	}

	/**
	 * Find all.
	 *
	 * @return the list
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAll() {
		return entityManager.createQuery("from " + daoType.getName()).getResultList();
	}

	/**
	 * Update.
	 *
	 * @param entity the entity
	 * @return the t
	 */
	@Override
	public T update(T entity) {
		return entityManager.merge(entity);
	}

}