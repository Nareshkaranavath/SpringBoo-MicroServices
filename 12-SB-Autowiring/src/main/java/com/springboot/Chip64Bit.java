package com.springboot;

import org.springframework.stereotype.Component;

import org.springframework.stereotype.Component;

@Component("chip64")
public class Chip64Bit implements IChip {

	public Chip64Bit() {
		System.out.println("Chip64Bit :: constructor");
	}

	@Override
	public boolean  execute() {
		// TODO Auto-generated method stub
		System.out.println("64bitchip processsing started...");
		return true;
	}

}
