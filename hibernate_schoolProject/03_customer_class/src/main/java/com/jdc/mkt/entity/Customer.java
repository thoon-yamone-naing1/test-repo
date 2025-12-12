package com.jdc.mkt.entity;

import java.time.LocalDateTime;
import java.util.Date;

import org.hibernate.annotations.ColumnDefault;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
@Table(name = "customer_tbl")
public class Customer 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cus_id;
	
	@Column(nullable = false, length = 45)
	private String cus_name;
	
	private int store_id;
	private String email;
	private String address_id;
	
	@ColumnDefault("1")
	private boolean active;
	
	@Temporal(TemporalType.DATE)
	private Date create_date;
	private LocalDateTime last_update;

	@ManyToOne
	private Address address;
	
	
	
	
	
	
}
