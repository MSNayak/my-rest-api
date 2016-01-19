package com.tbs.ecm.service;

import com.tbs.ecm.vo.UserRestTJVO;

public interface UserService {
	/**
	 * 
	 * @param loginSrlNo
	 * @return {@link UserRestTJVO}
	 */
	public UserRestTJVO getUser(Long loginSrlNo);
	
	/**
	 * 
	 * @description It works for both loginId or email3
	 * @return {@link UserRestTJVO}
	 */
	UserRestTJVO getUserByLoginIdOrEmail(String loginIdOrEmail3);
	
	/**
	 * 
	 * @param email3
	 * @param agent
	 * @return {@link UserRestTJVO}
	 */
	UserRestTJVO getUserByEmailAndAgent(String email3,String agent);
	
	/**
	 * 
	 * @param loginId
	 * @return true if success otherwise false.
	 */
	boolean updateUserPremiumExpDate(String loginId);
	
}
