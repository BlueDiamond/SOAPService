package com.bd.soap.cxf.bean;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "PersonID")
	private int personID;
	
	@Column(name = "FirstName")
	private String firstName;
	
	@Column(name = "LastName")
	private String lastName;
	
    @Column(name = "DOB")
    private Date dob;

    @Column(name = "Gender")
    private String gender;

    @Column(name = "EmailID")
    private String emailID;

    @Column(name = "CellPhone")
    private String cellPhone;
    
    @Column(name = "HomePhone")
    private String homePhone;
    
    @Column(name = "DeskPhone")
    private String deskPhone;
    
    @Column(name = "DeskExt")
    private String deskExt;

	public int getPersonID() {
		return personID;
	}

	public void setPersonID(int personID) {
		this.personID = personID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getDeskPhone() {
		return deskPhone;
	}

	public void setDeskPhone(String deskPhone) {
		this.deskPhone = deskPhone;
	}

	public String getDeskExt() {
		return deskExt;
	}

	public void setDeskExt(String deskExt) {
		this.deskExt = deskExt;
	}
    
    
    
    
}
