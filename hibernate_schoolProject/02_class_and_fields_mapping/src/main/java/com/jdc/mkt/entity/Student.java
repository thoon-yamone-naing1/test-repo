package com.jdc.mkt.entity;


import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;


import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
@Table(name = "student_tbl")
public class Student 
{
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(nullable = false)
//	private int stuId;
	
	@Column(columnDefinition = "varchar(45) not null")
	private String stuName;
	
	@Temporal(TemporalType.DATE)
	private Date dob;
	
	@Column(columnDefinition = "varchar(45) not null")
	private String nrc;
	
	@Column(nullable = false)
	private int schoolId;
	
	@Column(nullable = false)
	private int addressId;
	
	@ManyToOne
	private School school;
	
	@ManyToOne
	private Address address;
	
	@OneToMany
	private Licence licence;
	

}
