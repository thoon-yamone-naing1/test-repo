package com.jdc.mkt.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "incomes_info_tbl")
public class IncomesInfo 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private LocalDate date;
	private String description;
	
	@Column(name = "incomes_type")
	@Enumerated(EnumType.STRING)
	private IncomesType incomeType;
	
	public enum IncomesType
	{
		salary, bonus, others
	}
	
	
	
	
	
	
	
	
	
	

}
