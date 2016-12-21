package org.shashank.library.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.shashank.library.dao.LoginDao;
import org.shashank.library.model.Login;
import org.shashank.library.utility.CRUD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDaoImpl implements LoginDao {

	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	private CRUD crud;

	public boolean isUnique(Login login) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(login.getClass());
		criteria.add(Restrictions.eq(Login.USERNAME, login.getUserName()));
		return criteria.list().isEmpty() ? true : false;
	}

	@Override
	public Login addLogin(Login login) {
		return (Login) crud.save(login);
	}

	public Login getLogin(Login login){
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(login.getClass());
		criteria.add(Restrictions.eq(Login.USERNAME, login.getUserName()));
		return (Login) criteria.uniqueResult();
	}
}
