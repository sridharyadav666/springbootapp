package com.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.entity.EmployeeEntity;
import com.ashokit.persistance.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	
	@Autowired
	EmployeeRepo emprepo;
	
	
	@Override
	public boolean insertEmployee(EmployeeEntity entity) {
	EmployeeEntity employeeEntity = emprepo.save(entity);
	
	if(employeeEntity!=null) {
		return true;
	}
	
		return false;
	}

	
	
}
