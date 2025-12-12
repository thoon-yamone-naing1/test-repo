package com.jdc.mkt.entity;

import java.util.Date;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
@Table(name = "licence_tbl")
public class Licence 
{
	@EmbeddedId
	private LicensePk studentId;
	
	
	
	
	
	@Enumerated(EnumType.STRING)
	private BloodType blood;
	
	public enum BloodType
	{
		A, B, AB, O
	}
	
	@Temporal(TemporalType.DATE)
	private Date issued_dt;
	
	@Temporal(TemporalType.DATE)
	private Date valid_dt;
	
	@ManyToOne
	private Student student;

}
