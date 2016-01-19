package com.tbs.ecm.dao;

import com.tbs.ecm.domain.User;
public interface UserDao extends SuperDao<User, String> {
	
	public User getUser(Long loginSrlNo);
	
	/**
	 * 
	 * @description It works for both loginId or email 3
	 * @return {@link User}
	 */
	User getUserByLoginIdOrEmail(String loginIdOrEmail3);
	
	/**
	 * 
	 * @param email3
	 * @param agent
	 * @return {@link User}
	 */
	User getUserByEmailAndAgent(String email3,String agent);

}
