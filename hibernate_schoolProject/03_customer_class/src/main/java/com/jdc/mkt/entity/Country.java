package com.jdc.mkt.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "country_tbl")
public class Country 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int country_id;
	
	@Column(nullable = false, length = 45)
	private String country_name;
	private LocalDateTime last_update;

	
	
	
	
	
	
	
	
}
