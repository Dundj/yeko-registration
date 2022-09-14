package com.nidservices.yekoregistration.config;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nidservices.yekoregistration.registry.ServiceRegistry;

@Configuration
public class UserConfig {
  @Bean
  public FactoryBean<?> factoryBean() {
	  final ServiceLocatorFactoryBean bean = new ServiceLocatorFactoryBean();
	  bean.setServiceLocatorInterface(ServiceRegistry.class);
	return bean;
  }
}

