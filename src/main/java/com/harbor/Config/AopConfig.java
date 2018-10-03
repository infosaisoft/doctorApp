package com.harbor.Config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EnableTransactionManagement
public class AopConfig {


	@Bean(name="dsTxMgmr",autowire=Autowire.BY_TYPE)
	public  DataSourceTransactionManager createDsTxMgmr(){
		return new DataSourceTransactionManager();
	}

}

	
	
	
	
	
	
	

