package com.mortagage.mortagage.Entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	
	private String name;
	private LocalDate dob;
	private String gender;
	private long salalry;
	private String panNo;
	private String propAddress;
	private String pinNo;
	private long propArea;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getSalalry() {
		return salalry;
	}
	public void setSalalry(long salalry) {
		this.salalry = salalry;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public String getPropAddress() {
		return propAddress;
	}
	public void setPropAddress(String propAddress) {
		this.propAddress = propAddress;
	}
	
	public long getPropArea() {
		return propArea;
	}
	public void setPropArea(long propArea) {
		this.propArea = propArea;
	}
	public String getPinNo() {
		return pinNo;
	}
	public void setPinNo(String pinNo) {
		this.pinNo = pinNo;
	}
	
}
