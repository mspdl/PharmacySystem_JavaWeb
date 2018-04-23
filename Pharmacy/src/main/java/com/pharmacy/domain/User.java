package com.pharmacy.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class User extends GenericDomain {
	
	@Column(length = 32, nullable = false)
	private String password;
	
	@Column(nullable = false)
	private Character type;

}
