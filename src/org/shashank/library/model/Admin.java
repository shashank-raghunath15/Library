package org.shashank.library.model;

import javax.persistence.Entity;

@Entity
public class Admin extends User{

	private long employeeNo;

	public long getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(long employeeNo) {
		this.employeeNo = employeeNo;
	}
	
	
}
