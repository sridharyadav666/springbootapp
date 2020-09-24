package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.entity.EmployeeEntity;
import com.ashokit.service.EmployeeService;

@SpringBootApplication
public class SpringbootappApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringbootappApplication.class, args);
		
		EmployeeService service = context.getBean(EmployeeService.class);
		
		EmployeeEntity entity=new EmployeeEntity();
		entity.setEid(111);
		entity.setEname("Pawankalyan");
		entity.setEaddr("Hyd");
		
		boolean insertEmployee = service.insertEmployee(entity);
		
		if(insertEmployee==true) {
			System.out.println("Employee Inserted Successfully");
		}else {
			System.out.println("Employee Inserted Failure");
		}
	}

}
