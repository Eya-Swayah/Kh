package com.luv2code.springboot.thymeleafdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luv2code.springboot.thymeleafdemo.dao.ControlRepository;
import com.luv2code.springboot.thymeleafdemo.entity.Control;

@Service
public class ControlServiceImplement implements  ControlService  {

	private ControlRepository controlRepository;
	
	@Autowired
	public ControlServiceImplement(ControlRepository theControlRepository) {
		controlRepository = theControlRepository;
	}
	
	@Override
	public List<Control> findAll() {
		return controlRepository.findAll();
	}

	@Override
	public Control findById(int theId) {
		Optional<Control> result = controlRepository.findById(theId);
		
		Control theControl = null;
		
		if (result.isPresent()) {
			theControl = result.get();
		}
		else {
			// we didn't find the employee
			throw new RuntimeException("Did not find control id - " + theId);
		}
		
		return theControl;
	}

	@Override
	public void save(Control theControl) {
		controlRepository.save(theControl);
	}

	@Override
	public void deleteById(int theId) {
		controlRepository.deleteById(theId);
	}

}






