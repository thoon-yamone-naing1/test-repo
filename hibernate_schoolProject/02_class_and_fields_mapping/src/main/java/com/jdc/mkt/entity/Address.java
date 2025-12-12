package com.jdc.mkt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "address_tbl")
public class Address 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private int id;
	
	@Column(columnDefinition = "varchar(45) not null")
	private String state;
	
	@Column(columnDefinition = "varchar(45) not null")
	private String township;
	
	@Column(columnDefinition = "varchar(45) not null")
	private String street;
	
	@OneToMany
	private Student student;

}
