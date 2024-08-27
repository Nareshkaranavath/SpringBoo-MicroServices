package com.makemyTrip.binding;

import java.time.LocalDate;

public class Passenger {

	private String name;
	private LocalDate doj;
	private String gender;
	private String departure;
	private String arrival;
	private Integer trainNum;

	public Passenger() {
		// super();
	}

	public Passenger(String name, LocalDate doj, String gender, String departure, String arrival, Integer trainNum) {
		super();
		this.name = name;
		this.doj = doj;
		this.gender = gender;
		this.departure = departure;
		this.arrival = arrival;
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

}
