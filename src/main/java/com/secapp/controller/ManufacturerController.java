package com.secapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.secapp.model.Manufacturer;
import com.secapp.service.ManufacturerService;

@Controller
public class ManufacturerController {

	@Autowired
	ManufacturerService manufacturerService;

	@RequestMapping(value = "/airplane/manufacturers", method = RequestMethod.GET)
	@ResponseBody
	public List<Manufacturer> getManufacturers() {
		return this.manufacturerService.getManufacturers();
	}

}
