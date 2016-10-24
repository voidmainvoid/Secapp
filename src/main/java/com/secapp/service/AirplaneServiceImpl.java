package com.secapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.querydsl.core.types.Predicate;
import com.secapp.model.Airplane;
import com.secapp.model.QAirplane;
import com.secapp.repository.AirplaneRepository;
import com.secapp.repository.QAirplaneRepository;

@Service
public class AirplaneServiceImpl implements AirplaneService {

	@Autowired
	private AirplaneRepository airplaneRepository;
	@Autowired
	private QAirplaneRepository qQAirplaneRepository;

	@Override
	public void addAirplane(Airplane airplane) {
		this.airplaneRepository.save(airplane);

	}

	@Override
	public List<Airplane> getAirplanes() {
		System.out.println("getAirplanes");

		QAirplane qAirplane = QAirplane.airplane;
		Predicate pred = qAirplane.review.eq("xxx");
		List<Airplane> list = (List<Airplane>) this.qQAirplaneRepository.findAll(pred);
		System.out.println("DSL: " + list.size());

		return this.airplaneRepository.findAll();
	}

}
