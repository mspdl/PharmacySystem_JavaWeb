package com.pharmacy.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class SaleItem extends GenericDomain {

	@Column(nullable = false)
	private Short quantity;

	@Column(nullable = false, precision = 7, scale = 2)
	private BigDecimal partialValue;

	@ManyToOne
	@JoinColumn(nullable = false)
	private Product product;

	@ManyToOne
	@JoinColumn(nullable = false)
	private Employee employee;

	public Short getQuantity() {
		return quantity;
	}

	public void setQuantity(Short quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPartialValue() {
		return partialValue;
	}

	public void setPartialValue(BigDecimal partialValue) {
		this.partialValue = partialValue;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
