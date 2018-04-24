package com.pharmacy.dao;

import org.junit.Test;

import com.pharmacy.domain.Manufacturer;

public class ManufacturerDAOTest {

	@Test
	public void save() {
		Manufacturer manufacturer = new Manufacturer();
		manufacturer.setDescription("Google");
	}
}
