package com.secapp.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "airplane")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value = "airplane")
public class Airplane implements Serializable {

	private Date firstFlight;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String manufacturer;
	private String name;
	private String review;

	public Date getFirstFlight() {
		return this.firstFlight;
	}

	public Long getId() {
		return this.id;
	}

	public String getManufacturer() {
		return this.manufacturer;
	}

	public String getName() {
		return this.name;
	}

	public String getReview() {
		return this.review;
	}

	public void setFirstFlight(Date firstFlight) {
		this.firstFlight = firstFlight;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setReview(String review) {
		this.review = review;
	}

}
