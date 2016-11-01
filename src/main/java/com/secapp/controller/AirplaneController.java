package com.secapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.secapp.model.Airplane;
import com.secapp.service.AirplaneService;

@Controller
public class AirplaneController {

	@Autowired
	private AirplaneService airplaneService;

	@RequestMapping(value = "/airplane/addairplane", method = RequestMethod.POST)
	public String addAirplane(@ModelAttribute Airplane airplane, BindingResult bindingResult, Model model) {
		System.out.println("addAirplane controller /" + airplane);
		model.addAttribute("Airplane", airplane);
		this.airplaneService.addAirplane(airplane);
		return "airplane";
	}

	@RequestMapping("/airplane")
	public String airplane(@ModelAttribute Airplane airplane, BindingResult bindingResult, Model model) {
		model.addAttribute("Airplane", airplane);
		return "airplane";
	}

	@RequestMapping(value = "/airplane/getairplanes", method = RequestMethod.GET)
	@ResponseBody
	public List<Airplane> getAirplanes() {
		System.out.println("getAirplanes");
		
		return this.airplaneService.getAirplanes();
	}

}
