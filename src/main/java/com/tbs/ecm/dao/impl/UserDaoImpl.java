package com.tbs.ecm.dao.impl;

import org.apache.commons.lang.StringUtils;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.tbs.ecm.dao.UserDao;
import com.tbs.ecm.domain.User;

@Repository
public class UserDaoImpl extends SuperDaoImpl<User, String> implements UserDao {

	public UserDaoImpl() {
		super(User.class);
	}

	@Override
	public User getUserByLoginIdOrEmail(String loginIdOrEmail3) {
		Criteria ctr = getCurrentSession().createCriteria(User.class);
		User user = null;
		if (StringUtils.isNotBlank(loginIdOrEmail3)) {
			int subIndex = loginIdOrEmail3.indexOf("@");
			if (subIndex != -1) {
				ctr.add(Restrictions.eq("email3", loginIdOrEmail3));
			} else {
				ctr.add(Restrictions.eq("loginId", loginIdOrEmail3));
			}
			ctr.add(Restrictions.ne("netStatus", 3));
			user = (User) ctr.uniqueResult();
		}
		return user;
	}

	@Override
	public User getUser(Long loginSrlNo) {
		Criteria ctr = getCurrentSession().createCriteria(User.class);
		ctr.add(Restrictions.eq("loginSrlNo", loginSrlNo));
		return (User) ctr.uniqueResult();
	}

	@Override
	public User getUserByEmailAndAgent(String email3, String agent) {
		Criteria ctr = getCurrentSession().createCriteria(User.class);
		ctr.add(Restrictions.eq("email3", email3));
		ctr.add(Restrictions.eq("agent", agent));
		ctr.add(Restrictions.ne("netStatus", 3));
		return (User) ctr.uniqueResult();
	}
}
