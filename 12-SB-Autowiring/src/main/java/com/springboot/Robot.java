package com.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Robot {
	@Autowired
	@Qualifier("chip32")//identify the bean based on name 
	private IChip chip;

	public void doWork() {
		System.out.println("Injected ::" + chip.getClass().getName());
		boolean status = chip.execute();

		if (status) {
			System.out.println("Robot is processing ");
		} else {
			System.out.println("Rot is not processing ");
		}
	}

}
