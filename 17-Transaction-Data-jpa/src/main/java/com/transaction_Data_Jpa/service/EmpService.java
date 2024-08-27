package com.transaction_Data_Jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transaction_Data_Jpa.empRepo.AddressRepo;
import com.transaction_Data_Jpa.empRepo.EmpRepo;
import com.transaction_Data_Jpa.entity.Address;
import com.transaction_Data_Jpa.entity.Emp;

import jakarta.transaction.Transactional;

@Service
public class EmpService {
	@Autowired
	private AddressRepo addressRepo;
	@Autowired
	private EmpRepo empRepo;

	@Transactional(rollbackOn = Exception.class)
	public void saveEmp() {
		Emp emp = new Emp();
		emp.setName("Venu");
		emp.setSalary(81000.00);
		Emp saveEmp = empRepo.save(emp);
		System.out.println(saveEmp);


		Address add = new Address();
		add.setCity("Seria");
		add.setState("Kerala");
		add.setCountry("India");

		add.setEid(saveEmp.getEid());
		Address saveaddr = addressRepo.save(add);
		System.out.println(saveaddr);
	}
}
