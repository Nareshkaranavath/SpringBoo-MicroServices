package com.springboot;

import org.springframework.stereotype.Component;

@Component("chip32")
public class Chip32bit implements IChip {

	public Chip32bit() {
		System.out.println("chip32bit :: constructor");
	}

	@Override
	public boolean execute() {
		// TODO Auto-generated method stub
		System.out.println("32bit chip processing started....");
       return true;
	}

}
