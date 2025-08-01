package com.cognizant.country_config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class CountryConfigApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(CountryConfigApplication.class);

	public static void main(String[] args) {
		LOGGER.debug("START main()");
		SpringApplication.run(CountryConfigApplication.class, args);
		displayCountry();
		LOGGER.debug("END main()");
	}

	public static void displayCountry() {
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country = (Country) context.getBean("country", Country.class);
		LOGGER.debug("Country : {}", country.toString());
	}
}
