package org.shashank.library.model;

import javax.persistence.Entity;

@Entity
public class Professor extends Subscriber {

	private long employeeNo;
	private String designation;

	public long getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(long employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
