package com.secapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.secapp.model.Airplane;
import com.secapp.repository.AirplaneRepository;

@Service
public class AirplaneServiceImpl implements AirplaneService {

	@Autowired
	private AirplaneRepository airplaneRepository;

	@Override
	public void addAirplane(Airplane airplane) {
		System.out.println("addAirplane service" + "rev: " + airplane.getReview());
		this.airplaneRepository.save(airplane);

	}

}
