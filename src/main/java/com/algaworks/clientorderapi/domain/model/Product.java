package com.algaworks.clientorderapi.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {

	@Id
	private Long id;
	
	private String name;
}
