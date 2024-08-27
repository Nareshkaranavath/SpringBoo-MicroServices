package com.bean.scope;

public class Engine {

	public Engine() {

		// TODO Auto-generated constructor stub
		System.out.println("Engine :: constructor");
	}

	public void start() {
		System.out.println("Engine start......");

	}

	public void doWork() {
		System.out.println("pulling water from ground ");
	}

	public void stop() {
		System.out.println("Engine Stopped .....");
	}

}
