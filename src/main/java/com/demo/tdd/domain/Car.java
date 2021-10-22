package com.demo.tdd.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Car {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	private String type;

	public Car() {
		super();
	}

	public Car(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
