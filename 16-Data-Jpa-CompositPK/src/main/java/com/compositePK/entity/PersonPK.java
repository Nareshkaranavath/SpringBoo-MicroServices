package com.compositePK.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class PersonPK {

	private Integer pid;
	private String passportNum;
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPassportNum() {
		return passportNum;
	}
	public void setPassportNum(String passportNum) {
		this.passportNum = passportNum;
	}
	@Override
	public String toString() {
		return "PersonPK [pid=" + pid + ", passportNum=" + passportNum + "]";
	}
	
	
}
