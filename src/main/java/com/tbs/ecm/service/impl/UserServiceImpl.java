package com.tbs.ecm.service.impl;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tbs.ecm.dao.UserDao;
import com.tbs.ecm.domain.User;
import com.tbs.ecm.service.UserService;
import com.tbs.ecm.util.RestUtil;
import com.tbs.ecm.vo.UserRestTJVO;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;

	@Override
	public UserRestTJVO getUser(Long loginSrlNo) {
		User user = userDao.getUser(loginSrlNo);
		return RestUtil.fromUser(user);
	}

	@Override
	public UserRestTJVO getUserByLoginIdOrEmail(String loginIdOrEmail3) {
		User user = userDao.getUserByLoginIdOrEmail(loginIdOrEmail3);
		return RestUtil.fromUser(user);
	}

	@Override
	public UserRestTJVO getUserByEmailAndAgent(String email3, String agent) {
		User user = userDao.getUserByEmailAndAgent(email3, agent);
		return RestUtil.fromUser(user);
	}

	@Override
	public boolean updateUserPremiumExpDate(String loginId) {
		boolean flag = false;
		try {
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.YEAR, +1);
			Date psExpiryDate = cal.getTime();
			User user = userDao.getUserByLoginIdOrEmail(loginId);
			user.setPsExpiryDate(psExpiryDate);
			user.setLastModifiedTime(new Date());
			user.setTransmitStatus("N");
			userDao.update(user);
			flag = true;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return flag;
	}
}
