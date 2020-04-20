package com.luv2code.springboot.thymeleafdemo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//import com.luv2code.springboot.thymeleafdemo.EnableGlobalMethodSecurity;
import com.luv2code.springboot.thymeleafdemo.entity.Control;
import com.luv2code.springboot.thymeleafdemo.service.ControlService;


@Controller
@RequestMapping("/controls")
public class ControlController {

	private ControlService controlService;
	
	public ControlController(ControlService theControlService) {
	controlService = theControlService;
	}
	
	// add mapping for "/list"

	@GetMapping("/list")
	public String listControls(Model theModel) {
		
		// get controls from db
		List<Control> theControls = controlService.findAll();
		
		// add to the spring model
		theModel.addAttribute("controls", theControls);
	
		
		return "control/list-controls";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Control theControl = new Control();
		
		theModel.addAttribute("control", theControl);
		
		return "control/control-form";
	}

	@PostMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("controlId") int theId,
									Model theModel) {
		
		// get the employee from the service
	Control theControl = controlService.findById(theId);
		
		// set employee as a model attribute to pre-populate the form
		theModel.addAttribute("control", theControl);
		
		// send over to our form
		return "control/control-form";			
	}
	
	
	@PostMapping("/save")
	public String saveControl(@ModelAttribute("control") Control theControl) {
		
		// save the employee
		controlService.save(theControl);
		
		// use a redirect to prevent duplicate submissions
		return "redirect:/controls/list";
	}
	
	
	@PostMapping("/delete")
	public String delete(@RequestParam("controlId") int theId) {
		
		// delete the employee
		controlService.deleteById(theId);
		
		// redirect to /employees/list
		return "redirect:/controls/list";
		
	}
}


















