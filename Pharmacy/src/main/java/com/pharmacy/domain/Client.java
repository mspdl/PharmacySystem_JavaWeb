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
public class Client extends GenericDomain {

	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date registerDate;

	@Column(nullable = false)
	private Boolean released;

	@OneToOne
	@JoinColumn(nullable = false)
	private Person person;
	

}
