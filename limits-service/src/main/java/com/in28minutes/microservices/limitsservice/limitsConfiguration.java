package com.in28minutes.microservices.limitsservice;

//Representa a configuração do serviço limitservice
public class limitsConfiguration {

private int maximum;
private int minimum;



public limitsConfiguration() {
	super();
	// TODO Auto-generated constructor stub
}
public limitsConfiguration(int maximum, int minimum) {
	super();
	this.maximum = maximum;
	this.minimum = minimum;
}
public void setMaximum(int maximum) {
	this.maximum = maximum;
}
public void setMinimum(int minimum) {
	this.minimum = minimum;
}
public int getMaximum() {
	return maximum;
}
public int getMinimum() {
	return minimum;
}


}
