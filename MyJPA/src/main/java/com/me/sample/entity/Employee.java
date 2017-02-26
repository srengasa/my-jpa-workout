package com.me.sample.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee", schema="SUDHIR")
public class Employee {

	@Id
	@Column(name="employee_id") 
	private String employeeId;
	
	@Column(name="date_of_join")
	private java.sql.Date joinDate;
	
	public Employee(String id, java.sql.Date date) {
		employeeId = id;
		joinDate = date;
	}
	
	public Employee() {}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public java.sql.Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(java.sql.Date joinDate) {
		this.joinDate = joinDate;
	}
	
}
