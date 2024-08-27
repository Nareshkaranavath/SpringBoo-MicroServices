package com.data_jpa_OTM_App.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Emp_tb1")
public class Emp1 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer eid;
	private String name;
	private double eslaray;

	@OneToMany(mappedBy = "emp", cascade = CascadeType.ALL
			  )
	private List<Address1> addrList;

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getEslaray() {
		return eslaray;
	}

	public void setEslaray(double eslaray) {
		this.eslaray = eslaray;
	}

	public List<Address1> getAddrList() {
		return addrList;
	}

	public void setAddrList(List<Address1> addrList) {
		this.addrList = addrList;
	}

}
