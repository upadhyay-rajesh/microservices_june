package com.facebook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facebook.dao.EmployeeDAOInterface;
import com.facebook.entity.Employee;

@Service
public class EmployeeService implements EmployeeServiceInterface{
	
	
	@Autowired
	private EmployeeDAOInterface ed;

	public int registerEmployeeService(Employee ee) {
		// TODO Auto-generated method stub
		return ed.registerEmployeeDAO(ee);
	}

}
