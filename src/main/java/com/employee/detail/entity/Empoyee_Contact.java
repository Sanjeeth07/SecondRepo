package com.employee.detail.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMP_CONTACT")
public class Empoyee_Contact implements Serializable
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2753250221749555824L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="EMP_ID")
	private int eId;
	
	@Column()
	private String eMobileNo;
	
	@Column()
	private String emailId;

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteMobileNo() {
		return eMobileNo;
	}

	public void seteMobileNo(String eMobileNo) {
		this.eMobileNo = eMobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
	
	
	
	

}
