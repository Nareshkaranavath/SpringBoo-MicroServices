package com.datajpaRepo.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import org.springframework.stereotype.Service;

import com.datajpaRepo.entity.Employee;
import com.datajpaRepo.repo.EmpRepo;

@Service
public class EmpService {

	private EmpRepo empRepo;

	public EmpService(EmpRepo empRepo) {
		this.empRepo = empRepo;
	}

	public void getAllEmps() {
		List<Employee> emps = empRepo.findAll();
		emps.forEach(e -> System.out.println(e));
	}

//sorting data
	public void getAllEmpsSort() {
		Sort sort = Sort.by("esalary", "ename").descending();
		List<Employee> emps = empRepo.findAll(sort);
		emps.forEach(e -> System.out.println(e));
	}

//pagination
	public void getAllEmpsPagnation() {
		int pageSize = 3;
		int pageNumber = 3;
		PageRequest pg = PageRequest.of(pageNumber - 1, pageSize);

		Page<Employee> page = empRepo.findAll(pg);
		List<Employee> emps = page.getContent();
		emps.forEach(e -> System.out.println(e));
	}

	public void getRecordsWithFilter() {
		Employee entity = new Employee();
		entity.setEname("Ram");
		entity.setEsalary(1000.00);
		Example<Employee> example = Example.of(entity);
		List<Employee> emps = empRepo.findAll(example);
		emps.forEach(e -> System.out.println(e));
	}
}
