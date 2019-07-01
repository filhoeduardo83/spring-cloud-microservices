package com.in28minutes.microservices.currencyconversionservice;

import java.math.BigDecimal;

public class CurrencyConversionBean {

	
private int id;
private String from;
private String to;
private BigDecimal conversionMultiple;
private BigDecimal quantity;
private BigDecimal totalCalculatedAmong;
private int port;



public int getPort() {
	return port;
}



public void setPort(int port) {
	this.port = port;
}



public CurrencyConversionBean() {
}



public CurrencyConversionBean(int id, String from, String to, BigDecimal conversionMultiple, BigDecimal quantity,
		BigDecimal totalCalculatedAmong, int port) {
	super();
	this.id = id;
	this.from = from;
	this.to = to;
	this.conversionMultiple = conversionMultiple;
	this.quantity = quantity;
	this.totalCalculatedAmong = totalCalculatedAmong;
	this.port = port;

}



public int getId() {
	return id;
}



public void setId(int id) {
	this.id = id;
}



public String getFrom() {
	return from;
}



public void setFrom(String from) {
	this.from = from;
}



public String getTo() {
	return to;
}



public void setTo(String to) {
	this.to = to;
}



public BigDecimal getConversionMultiple() {
	return conversionMultiple;
}



public void setConversionMultiple(BigDecimal conversionMultiple) {
	this.conversionMultiple = conversionMultiple;
}



public BigDecimal getQuantity() {
	return quantity;
}



public void setQuantity(BigDecimal quantity) {
	this.quantity = quantity;
}



public BigDecimal getTotalCalculatedAmong() {
	return totalCalculatedAmong;
}



public void setTotalCalculatedAmong(BigDecimal totalCalculatedAmong) {
	this.totalCalculatedAmong = totalCalculatedAmong;
}





}
