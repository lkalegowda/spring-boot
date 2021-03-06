package com.telstra.codechallenge.controller;

import java.util.Arrays;
import java.util.List;

import com.telstra.codechallenge.model.Quote;
import com.telstra.codechallenge.service.SpringBootQuotesService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootQuotesController {

  private SpringBootQuotesService springBootQuotesService;

  public SpringBootQuotesController(
      SpringBootQuotesService springBootQuotesService) {
    this.springBootQuotesService = springBootQuotesService;
  }

  @RequestMapping(path = "/quotes", method = RequestMethod.GET)
  public List<Quote> quotes() {
    return Arrays.asList(springBootQuotesService.getQuotes());
  }

  @RequestMapping(path = "/quotes/random", method = RequestMethod.GET)
  public Quote quote() {
    return springBootQuotesService.getRandomQuote();
  }
}
