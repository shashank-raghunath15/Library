package org.shashank.library.config.impl;

import org.shashank.library.config.SpringConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.shashank.library")
public class SpringConfigImpl implements SpringConfig {

/*	private HibernateConfig hibernateConfig = new HibernateConfigImpl();

	@Bean
	@Scope("singleton")
	public SessionFactory sessionFactory(SessionFactory sessionFactory) {
		return hibernateConfig.getSessionFactory();
	}*/
}
