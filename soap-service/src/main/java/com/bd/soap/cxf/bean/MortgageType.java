package com.bd.soap.cxf.bean;

public class MortgageType {
	public MortgageIdentifier getIndentifier() {
		return indentifier;
	}

	public void setIndentifier(MortgageIdentifier indentifier) {
		this.indentifier = indentifier;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	private MortgageIdentifier indentifier;
	private String name;
	private String description;
	
	public MortgageType (MortgageIdentifier indentifier, String name, String description ){
		this.indentifier = indentifier;
		this.name = name;
		this.description = description;
	}
}
