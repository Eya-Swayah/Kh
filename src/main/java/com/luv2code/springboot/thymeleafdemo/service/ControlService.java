package com.luv2code.springboot.thymeleafdemo.service;

import java.util.List;

import com.luv2code.springboot.thymeleafdemo.entity.Control;

public interface ControlService {

	public List<Control> findAll();
	
	public Control findById(int theId);
	
	public void save(Control theControl);
	
	public void deleteById(int theId);
	
}
