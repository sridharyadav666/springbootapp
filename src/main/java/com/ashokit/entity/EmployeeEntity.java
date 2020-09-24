package com.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="EMPLOYEE_DTLS")
public class EmployeeEntity {
	
	@Id
	@Column(name="EMP_ID")
	private Integer eid;
	@Column(name="EMP_NAME")
	private String ename;
	@Column(name="EMP_ADDR")
	private String eaddr;

}
