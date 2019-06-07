package com.collabera.rest.springbootrestclient.model;

import java.util.Date;

public class Employee {

	private String fullName;

	private Date dateOfBirth;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
