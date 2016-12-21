package org.shashank.library.config.impl;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.shashank.library.config.HibernateConfig;
import org.shashank.library.model.Address;
import org.shashank.library.model.Admin;
import org.shashank.library.model.Login;
import org.shashank.library.model.Model;
import org.shashank.library.model.Professor;
import org.shashank.library.model.Student;
import org.shashank.library.model.Subscriber;
import org.shashank.library.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@org.springframework.context.annotation.Configuration
public class HibernateConfigImpl implements HibernateConfig {

	@Bean
	@Scope("singleton")
	public SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration();
		configuration.addPackage("org.shashank.library.model");
		configuration.addAnnotatedClass(Model.class);
		configuration.addAnnotatedClass(Admin.class);
		configuration.addAnnotatedClass(Address.class);
		configuration.addAnnotatedClass(Login.class);
		configuration.addAnnotatedClass(Professor.class);
		configuration.addAnnotatedClass(Student.class);
		configuration.addAnnotatedClass(Subscriber.class);
		configuration.addAnnotatedClass(User.class);
		/* configuration.addAnnotatedClass(Admin.class); */
		return configuration.buildSessionFactory();
	}
}
