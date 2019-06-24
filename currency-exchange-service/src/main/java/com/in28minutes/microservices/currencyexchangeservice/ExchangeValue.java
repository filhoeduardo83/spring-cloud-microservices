package com.in28minutes.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {
	
	@Id
	private Long id;
	
	@Column(name="currency_from")
	private String from;
	@Column(name="currency_to")

	private String to;
	private BigDecimal currencyValue;
	
	private int port=0;
	
	public ExchangeValue() {
		super();
	}


	public ExchangeValue(Long id, String from, String to, BigDecimal currencyValue, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.currencyValue = currencyValue;
		this.port=0;
	}


	public Long getId() {
		return id;
	}
	
	public String getFrom() {
		return from;
	}
	
	public String getTo() {
		return to;
	}
	
	public BigDecimal getCurrencyValue() {
		return currencyValue;
	}


	public int getPort() {
		return port;
	}


	public void setPort(int port) {
		this.port = port;
	}
	
	

	
	
}
