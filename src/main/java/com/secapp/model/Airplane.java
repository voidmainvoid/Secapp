package com.secapp.model;

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
public class Airplane {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Integer performance;
	private String review;

	public Long getId() {
		return this.id;
	}

	public Integer getPerformance() {
		return this.performance;
	}

	public String getReview() {
		return this.review;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setPerformance(Integer performance) {
		this.performance = performance;
	}

	public void setReview(String review) {
		this.review = review;
	}

}
