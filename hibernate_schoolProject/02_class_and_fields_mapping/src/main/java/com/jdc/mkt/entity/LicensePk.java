package com.jdc.mkt.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class LicensePk implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Column(name = "student_id", insertable = false, updatable = false)
	private int studentId;
	private LicenceType licence;
	
	public enum LicenceType
	{
		A, B, C
	}
	

}
