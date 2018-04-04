package com.pharmacy.domain;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@SuppressWarnings("serial")
@MappedSuperclass
public class GenericDomain implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long code;

	public long getCode() {
		return code;
	}

	public void setCode(long code) {
		this.code = code;
	}

}
