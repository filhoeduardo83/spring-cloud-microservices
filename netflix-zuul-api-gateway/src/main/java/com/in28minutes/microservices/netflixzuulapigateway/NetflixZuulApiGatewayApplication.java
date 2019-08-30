package com.in28minutes.microservices.netflixzuulapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;
import io.micrometer.core.instrument.LongTaskTimer.Sample;

@EnableZuulProxy
@SpringBootApplication
@EnableDiscoveryClient
public class NetflixZuulApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixZuulApiGatewayApplication.class, args);
	}
	

	//*Método para ativar o Sleuth. Essa ferramenta atribui ID nas requisições, facilitando o rastreio. Todo microservice rastreado deve conter esse método.
	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}

}
