package com.harbor.Config;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.harbor.bo.HospitalpatientBo;

@Configuration
@ComponentScan(basePackages="com.harbor.Dao")
public class PersistanceConfig {
	
	@Autowired
	private DataSource ds;
	
	
	@Bean(autowire=Autowire.BY_TYPE)
	public LocalSessionFactoryBean createSessionFactoryBean() {
		LocalSessionFactoryBean localSesFac=null;
		
		localSesFac=new LocalSessionFactoryBean();
		localSesFac.setAnnotatedClasses(HospitalpatientBo.class);
		localSesFac.setAnnotatedPackages("com.harbor.bo");
		
		return localSesFac;
	}
	
	@Bean
	@Primary
	public SessionFactory createSessionFactory() {
		return createSessionFactoryBean().getObject();
	}
	
	
	@Bean(autowire=Autowire.BY_TYPE)
	public HibernateTemplate createHibernateTemplate() {
		return new HibernateTemplate();
	}

}
