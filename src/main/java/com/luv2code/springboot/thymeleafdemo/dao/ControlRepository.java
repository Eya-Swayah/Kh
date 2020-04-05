package com.luv2code.springboot.thymeleafdemo.dao;

import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.luv2code.springboot.thymeleafdemo.entity.Control;

public interface ControlRepository extends MongoRepository <Control, Integer> {

	// that's it ... no need to write any code LOL!
	
	// add a method to sort by last name
	//public List<Control> findAllByOrderByLastNameAsc();
	
}
