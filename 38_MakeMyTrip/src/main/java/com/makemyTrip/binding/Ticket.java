package com.makemyTrip.binding;

import java.time.LocalDate;

public class Ticket {

	private Integer tid;
	private String tStatus;
	private String departure;
	private String arrival;
	private Integer trainNum;
	private String name;
	private LocalDate doj;
	private String gender;

	public Ticket() {

	}

	public Ticket(Integer tid, String tStatus, String departure, String arrival, Integer trainNum, String name,
			LocalDate doj, String gender) {
		super();
		this.tid = tid;
		this.tStatus = tStatus;
		this.departure = departure;
		this.arrival = arrival;
		this.trainNum = trainNum;
		this.name = name;
		this.doj = doj;
		this.gender = gender;
	}

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public String gettStatus() {
		return tStatus;
	}

	public void settStatus(String tStatus) {
		this.tStatus = tStatus;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public Integer getTrainNum() {
		return trainNum;
	}

	public void setTrainNum(Integer trainNum) {
		this.trainNum = trainNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
