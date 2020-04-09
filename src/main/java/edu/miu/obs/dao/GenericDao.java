package edu.miu.obs.dao;

import java.util.List;

/**
 * The Interface GenericDao.
 * @author Elias Rurangwa
 * @version 1.0
 *
 * @param <T> the generic type
 */
public interface GenericDao<T> {

    /**
     * Save.
     *
     * @param t the t
     */
    void save(T t);

    /**
     * Delete.
     *
     * @param id the id
     */
    void delete(Long id);

    /**
     * Find one.
     *
     * @param id the id
     * @return the t
     */
    T findOne(Long id);

    /**
     * Update.
     *
     * @param t the t
     * @return the t
     */
    T update(T t);   
    
    /**
     * Find all.
     *
     * @return the list
     */
    List<T> findAll();

    
    
}
