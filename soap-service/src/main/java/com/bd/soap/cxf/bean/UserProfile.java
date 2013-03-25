package com.bd.soap.cxf.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class UserProfile implements Serializable {

	private long profileID;
	private String name;
	private String emailID;
	private String sex;
	private String relationshipStatus;
	private String languages;
	private String livesIn;
	private Timestamp createdTS;

	public long getProfileID() {
		return profileID;
	}

	public void setProfileID(long profileID) {
		this.profileID = profileID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getRelationshipStatus() {
		return relationshipStatus;
	}

	public void setRelationshipStatus(String relationshipStatus) {
		this.relationshipStatus = relationshipStatus;
	}

	public String getLanguages() {
		return languages;
	}

	public void setLanguages(String languages) {
		this.languages = languages;
	}

	public String getLivesIn() {
		return livesIn;
	}

	public void setLivesIn(String livesIn) {
		this.livesIn = livesIn;
	}

	public Timestamp getCreatedTS() {
		return createdTS;
	}

	public void setCreatedTS(Timestamp createdTS) {
		this.createdTS = createdTS;
	}

}
