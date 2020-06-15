package com.facebook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.facebook.entity.Employee;
import com.facebook.service.EmployeeServiceInterface;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceInterface ei;
	
	@RequestMapping("register.htm")
	public ModelAndView registerEmployee(@RequestParam("name") String name,@RequestParam("pass") String pass,@RequestParam("email") String email,@RequestParam("address") String address) {
		
		Employee ee=new Employee();
		ee.setName(name);
		ee.setPass(pass);
		ee.setEmail(email);
		ee.setAddress(address);
		
		
		int i=ei.registerEmployeeService(ee);
		
		
		
		
		ModelAndView mv=new ModelAndView();
		
		if(i>0) {
		mv.addObject("a1", "Registration successful");
		
		mv.setViewName("result.jsp");
		}
		
		return mv;
	}

}
