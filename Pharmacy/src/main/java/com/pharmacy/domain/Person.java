package com.pharmacy.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@SuppressWarnings("serial")
@Entity
public class Person extends GenericDomain {

	@Column(length = 60, nullable = false)
	private String fullName;

	@Column(nullable = false)
	private Integer personalCode;

	@Column(length = 100, nullable = false)
	private String fullAddress;

	@Column(length = 15)
	private String addressCode;

	@Column(length = 15)
	private String phone;

	@Column(length = 50, nullable = false)
	private String email;

	@ManyToOne
	@JoinColumn(nullable = false)
	private City city;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Integer getPersonalCode() {
		return personalCode;
	}

	public void setPersonalCode(Integer personalCode) {
		this.personalCode = personalCode;
	}

	public String getFullAddress() {
		return fullAddress;
	}

	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

	public String getAddressCode() {
		return addressCode;
	}

	public void setAddressCode(String addressCode) {
		this.addressCode = addressCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

}
