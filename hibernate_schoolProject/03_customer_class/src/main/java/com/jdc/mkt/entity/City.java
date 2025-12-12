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
@Table(name = "city_tbl")
public class City 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int city_id;
	
	@Column(nullable = false, length = 45)
	private String city_name;
	
	private int country_id;
	private LocalDateTime  last_update;
	
	@ManyToOne
	private Country country;
	
	
	
	
	
	

}
