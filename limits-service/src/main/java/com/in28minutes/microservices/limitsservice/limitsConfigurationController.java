package com.in28minutes.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class limitsConfigurationController {

@Autowired	
private Configuration configuration;

@GetMapping("/limits")
public limitsConfiguration recuperaLimites() {
	return new limitsConfiguration(configuration.getMaximum(),configuration.getMinimum());
}
	
}
