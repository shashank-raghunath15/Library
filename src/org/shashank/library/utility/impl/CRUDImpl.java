package org.shashank.library.utility.impl;

import java.io.Serializable;
import java.util.Collection;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.shashank.library.model.Model;
import org.shashank.library.utility.CRUD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CRUDImpl implements CRUD {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Model save(Model model) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Serializable id = session.save(model);
		session.getTransaction().commit();
		session.close();
		return get(model.getClass(), id);
	}

	@Override
	public void update(Model model) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(model);
		session.getTransaction().commit();
		session.close();

	}

	@Override
	public void delete(Model model) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(model);
		session.getTransaction().commit();
		session.close();

	}

	public Model get(Class<? extends Model> class1, Serializable id) {
		Session session = sessionFactory.openSession();
		return session.get(class1, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<? extends Model> getAll(Class<? extends Model> model) {

		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(model.getClass());
		return criteria.list();
	}

	@Override
	public Model get(Model model) {
		Session session = sessionFactory.openSession();
		return session.get(model.getClass(), (Serializable) model.getId());
	}

}
