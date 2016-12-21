package org.shashank.library.model;

import javax.persistence.Entity;

@Entity
public class Student extends Subscriber {

	private long rollNo;
	private String academicYear;

	
	public long getRollNo() {
		return rollNo;
	}

	public void setRollNo(long rollNo) {
		this.rollNo = rollNo;
	}

	public String getAcademicYear() {
		return academicYear;
	}

	public void setAcademicYear(String academicYear) {
		this.academicYear = academicYear;
	}

}
