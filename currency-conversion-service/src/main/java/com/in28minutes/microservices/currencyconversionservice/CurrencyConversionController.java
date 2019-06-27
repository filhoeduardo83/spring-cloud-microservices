package com.in28minutes.microservices.currencyconversionservice;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConversionController {

@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")	
public CurrencyConversionBean currencyConversion(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity) {
	return new CurrencyConversionBean(1,from,to,BigDecimal.valueOf(10),BigDecimal.valueOf(20),BigDecimal.valueOf(30));

}
	
}
