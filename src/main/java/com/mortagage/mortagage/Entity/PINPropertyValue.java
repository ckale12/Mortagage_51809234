package com.mortagage.mortagage.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PINPropertyValue {
	
	@Id
	private String pinNo;
	private long propValue;
	
	public String getPinNo() {
		return pinNo;
	}
	public void setPinNo(String pinNo) {
		this.pinNo = pinNo;
	}
	public long getPropValue() {
		return propValue;
	}
	public void setPropValue(long propValue) {
		this.propValue = propValue;
	}
	
	

}
