package com.luv2code.springboot.thymeleafdemo.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document

public class Control {

	// define fields
	
	//@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int id;

	private String room;
	

	private String temp;
	

	private String humidity;
	
		
	// define constructors
	
	public Control() {
		
	}
	
	public Control(int id, String room, String temp, String humidity) {
		this.id = id;
		this.room = room;
		this.temp= temp;
		this.humidity  =humidity;
	}


	public Control(String room, String temp, String humidity) {
		this.room = room;
		this.temp = temp;
		this.humidity = humidity;
	}

	// define getter/setter
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
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
		return "Employee [id=" + id +  ",room =" + room + ", temp=" + temp + ", humidity=" + humidity + "]";
	}
		
}











