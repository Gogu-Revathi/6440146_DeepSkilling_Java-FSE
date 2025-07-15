package com.cognizant.spring_learn.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import com.cognizant.spring_learn.model.Country;
import com.cognizant.spring_learn.service.CountryService;


@RestController
public class CountryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    @GetMapping("/country")
    public Country getCountryIndia() {
        LOGGER.info("START - getCountryIndia()");
        Country country;
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml")) {
            country = context.getBean("in", Country.class);
        }
        LOGGER.info("END - getCountryIndia()");
        return country;
    }

    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        LOGGER.info("START - getAllCountries()");
        List<Country> countryList;
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml")) {
            countryList = (List<Country>) context.getBean("countryList");
        }
        LOGGER.info("END - getAllCountries()");
        return countryList;
    }
    @Autowired
    private CountryService countryService;


    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {
        LOGGER.info("START - getCountry() with code: {}", code);
        Country country = countryService.getCountry(code);
        LOGGER.info("END - getCountry()");
        return country;
    }

}
