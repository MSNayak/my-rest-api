package com.tbs.ecm.dao;

import java.io.Serializable;
/**
 * 
 * @author Mithun
 *
 * @param <T> This is domain class.
 * @param <PK> This is primary key.
 */
public interface SuperDao <T, PK extends Serializable> {

	/** Persist the newInstance object into database */
    PK insert(T newInstance);

    /** Retrieve an object that was previously persisted to the database using
     *   the indicated id as primary key
     */
    T get(PK id);

    /** Save changes made to a persistent object.  */
    void update(T transientObject);

}
