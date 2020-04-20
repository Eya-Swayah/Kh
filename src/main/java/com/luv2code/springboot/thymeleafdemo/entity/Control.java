package com.luv2code.springboot.thymeleafdemo.entity;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "test")

public class Control {

	// define fields
	
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private BigInteger id;

	private String place;
	

	private String temp;
	

	private String humidity;
	
		
	// define constructors
	
	public Control() {
		
	}
	
	public Control(BigInteger id, String place, String temp, String humidity) {
		this.id = id;
		this.place = place;
		this.temp= temp;
		this.humidity  =humidity;
	}


	public Control(String place, String temp, String humidity) {
		this.place = place;
		this.temp = temp;
		this.humidity = humidity;
	}

	// define getter/setter
	
	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getplace() {
		return place;
	}

	public void setplace(String place) {
		this.place = place;
	}

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp  = temp;
	}

	public String getHumidity() {
		return humidity ;
	}

	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}

	// define tostring

	@Override
	public String toString() {
		return " [id=" + id +  ",place =" + place + ", temp=" + temp + ", humidity=" + humidity + "]";
	}
		
}











