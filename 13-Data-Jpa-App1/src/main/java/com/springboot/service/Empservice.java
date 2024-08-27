package com.springboot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.springboot.entity.Employee;
import com.springboot.repo.EmpRepository;

@Service
public class Empservice {
	private EmpRepository empRepository;

	public Empservice(EmpRepository empRepository) {

		this.empRepository = empRepository;
	}

	public void SaveEmps() {

		Employee e1 = new Employee(201, "Ram", 1000.30);
		Employee e2 = new Employee(202, "Sita", 2000.60);
		Employee e3 = new Employee(203, "Hanuma", 7000.40);
		List<Employee> list = Arrays.asList(e1, e2, e2);
		empRepository.saveAll(list);
		System.out.println("recordssaveAll.....");
	}

	public void getEmp(Integer eid) {
		Optional<Employee> emps = empRepository.findById(eid);
		if (emps.isPresent()) {
			Employee empl = emps.get();
			System.out.println(empl);
		} else {
			System.out.println("Recorde Not Found");
		}
	}

	public void getEmpls(List<Integer> eids) {
		Iterable<Employee> empls = empRepository.findAllById(eids);
		// empls.forEach(e-> System.out.Println(e));
		empls.forEach(System.out::println);
	}

	// retrieve all records
	public void getEmployes() {
		List<Employee> all = empRepository.findAll();
		all.forEach(System.out::println);
	}

// findBysalary
	public List<Employee> findByEsalaryGreaterThanEqual(double salary) {
		return empRepository.findByEsalaryGreaterThanEqual(2000.00);
		
	}

//findByename
	public List<Employee> findByEname(String ename) {
		return empRepository.findByEname(ename);
	}

	public void CallCustomQuries() {
		List<Employee> allEmpsHQL = empRepository.getAllEmpsHQL();
		allEmpsHQL.forEach(System.out::println);
	}
	public void saveEmployee() {

		System.out.println("Impl class :" + empRepository.getClass().getName());
		Employee e = new Employee();
		e.setEid(104);
		e.setEname("Homes");
		e.setEsalary(7500.30);

		// inserting record based on given object
		empRepository.save(e);

	}
	

}
