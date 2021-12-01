package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="data_details")
public class DataDetails {
	@Column(name="source")
	private String source;
	@Column(name="codeListCode")
	private String codeListCode;
	@Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="code")
	private String code;
	@Column(name="displayValue")
	private String displayValue;
	@Column(name="longDescription")
	private String longDescription;
	@Column(name="fromDate")
	private String fromDate;
	@Column(name="toDate")
	private String toDate;
	@Column(name="sortingPriority")
	private String sortingPriority;
	
	public DataDetails() {
		super();
	}
	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getCodeListCode() {
		return codeListCode;
	}
	public void setCodeListCode(String codeListCode) {
		this.codeListCode = codeListCode;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDisplayValue() {
		return displayValue;
	}
	public void setDisplayValue(String displayValue) {
		this.displayValue = displayValue;
	}
	public String getLongDescription() {
		return longDescription;
	}
	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	public String getSortingPriority() {
		return sortingPriority;
	}
	public void setSortingPriority(String sortingPriority) {
		this.sortingPriority = sortingPriority;
	}
	
	

}
