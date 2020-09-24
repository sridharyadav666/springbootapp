package com.ashokit.persistance;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.ashokit.entity.EmployeeEntity;

public interface EmployeeRepo extends CrudRepository<EmployeeEntity, Serializable> {

	
	
}
