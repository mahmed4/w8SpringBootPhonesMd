package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import dmacc.beans.Config;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Config config() {
		Config bean = new Config();
		bean.setMake("Apple");
		bean.setModel("iphone 12 pro");
		bean.setYear(2020);
		bean.setCpu("A14");
		return bean;
	}
}
