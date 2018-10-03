package com.harbor.Config;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EnableTransactionManagement
public class AopConfig {
	
	@Autowired
	SessionFactory sesfact;


	@Bean(name="hbTxMgmr",autowire=Autowire.BY_TYPE)
	public  PlatformTransactionManager createHibernateTransactionManager(){
		return new HibernateTransactionManager(sesfact);
	}

}

	
	
	
	
	
	
	

