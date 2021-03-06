package com.pharmacy.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class State extends GenericDomain {

	@Column(length = 2, nullable = false)
	private String abbreviation;

	@Column(length = 50, nullable = false)
	private String name;

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
