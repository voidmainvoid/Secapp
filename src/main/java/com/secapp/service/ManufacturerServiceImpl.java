package com.secapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.secapp.model.Manufacturer;
import com.secapp.repository.QManufacturerRepository;

@Service
public class ManufacturerServiceImpl implements ManufacturerService {

	@Autowired
	private QManufacturerRepository qManufacturerRepository;

	@Override
	public List<Manufacturer> getManufacturers() {
		// QManufacturer qManufacturer = QManufacturer.manufacturer;
		List<Manufacturer> manufacturers = (List<Manufacturer>) this.qManufacturerRepository.findAll();
		return manufacturers;
	}

}
