package com.chinarewards.test.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Example {

	@Id
	@GeneratedValue
	Long id;

	public Long getId() {
		return id;
	}

}
