package org.shashank.library.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Subscriber extends User {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long subsriberId;
	private String department;

	public long getSubsriberId() {
		return subsriberId;
	}

	public void setSubsriberId(long subsriberId) {
		this.subsriberId = subsriberId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
