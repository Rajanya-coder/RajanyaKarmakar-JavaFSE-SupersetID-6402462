package com.cognizant.spring_learn.service;

import com.cognizant.spring_learn.model.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

@Service
public class CountryService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryService.class);

    public Country getCountry(String code) {
        LOGGER.info("START getCountry with code: {}", code);

        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        List<Country> countryList = context.getBean("countryList", List.class);

        Country result = countryList.stream()
                .filter(c -> c.getCode().equalsIgnoreCase(code))
                .findAny()
                .orElse(null);

        LOGGER.info("END getCountry with result: {}", result);
        return result;
    }
}
