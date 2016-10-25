package com.secapp.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import com.secapp.model.Manufacturer;

public interface QManufacturerRepository
		extends CrudRepository<Manufacturer, Long>, QueryDslPredicateExecutor<Manufacturer> {

}
