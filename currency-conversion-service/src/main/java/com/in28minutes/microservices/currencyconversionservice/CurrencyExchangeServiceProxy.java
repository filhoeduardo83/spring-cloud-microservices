package com.in28minutes.microservices.currencyconversionservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


//*Configuração do Feign sem usar ribbon
//@FeignClient(name="currency-exchange-service", url="localhost:8000")
//*Feign chamando o serviço direto sem passar pelo api gateway
//@FeignClient(name="currency-exchange-service")

//*Feign chamando pelo api gateway
@FeignClient(name="netflix-zuul-api-gateway")
//*Ribbon balanceador
@RibbonClient(name="currency-exchange-service")
//Esta interface foi criada para poder facilitar a comunicação entre os microservices, usando Feing
public interface CurrencyExchangeServiceProxy {

	@GetMapping("/currency-exchange-service/currency-exchange/from/{from}/to/{to}")	
	public CurrencyConversionBean exchangeValue(@PathVariable("from") String from, @PathVariable("to") String to);
	
	
}
