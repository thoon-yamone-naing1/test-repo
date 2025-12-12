package com.jdc.mkt.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "address_tbl")
public class Address 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int address_id;
	
	@Column(nullable = false, length = 45)
	private String address;
	
	private String district;
	private int city_id;
	private String postal_code;
	private String phoneNo;
	private LocalDateTime last_update;

	@ManyToOne
	private City city;
	
	
}
