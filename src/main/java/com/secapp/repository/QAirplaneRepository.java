package com.secapp.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.secapp.model.Airplane;

@Repository
public interface QAirplaneRepository extends CrudRepository<Airplane, Long>, QueryDslPredicateExecutor<Airplane> {

}
