package com.szedu.framework.repository.impl

import javax.persistence.EntityManagerFactory
import javax.sql.DataSource

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.orm.jpa.JpaTransactionManager
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean
import org.springframework.orm.jpa.vendor.Database
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter
import org.springframework.transaction.PlatformTransactionManager
import org.springframework.transaction.annotation.EnableTransactionManagement
/*
@Configuration
@ComponentScan
@EnableTransactionManagement
*/
class PersistConfig {
/*
	@Autowired
	DataSource dataSource
	
	@Bean
	LocalContainerEntityManagerFactoryBean entityManagerFactory(){
		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter()
		vendorAdapter.setDatabase(Database.HSQL)
		vendorAdapter.setGenerateDdl(true)
		
		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean()
		factory.setPackagesToScan("com.szedu.framework")
		factory.setDataSource(dataSource)
		factory.setPersistenceUnitName("userRepo")
		
		return factory
	}
	
	@Bean
	PlatformTransactionManager transactionManager(){
		LocalContainerEntityManagerFactoryBean emfb = entityManagerFactory()
		EntityManagerFactory emf = emfb.getNativeEntityManagerFactory()
		
		JpaTransactionManager txManager = new JpaTransactionManager()
		txManager.setEntityManagerFactory(emf)
		
		return txManager
	}
	*/
}
