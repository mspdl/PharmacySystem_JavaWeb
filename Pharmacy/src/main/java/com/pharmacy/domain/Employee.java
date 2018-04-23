package com.pharmacy.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
public class Employee extends GenericDomain {

	@Column(length = 30, nullable = false)
	private String workPermit;

	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date admissionDate;

	@OneToOne
	@JoinColumn(nullable = false)
	private Person person;

	public String getWorkPermit() {
		return workPermit;
	}

	public void setWorkPermit(String workPermit) {
		this.workPermit = workPermit;
	}

	public Date getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
