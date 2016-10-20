package com.secapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.secapp.model.Airplane;

@Repository
public interface AirplaneRepository extends JpaRepository<Airplane, Long> {

}
