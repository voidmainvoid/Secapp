package com.secapp.service;

import java.util.List;

import com.secapp.model.Airplane;

public interface AirplaneService {

	public void addAirplane(Airplane airplane);

	public List<Airplane> getAirplanes();

}
