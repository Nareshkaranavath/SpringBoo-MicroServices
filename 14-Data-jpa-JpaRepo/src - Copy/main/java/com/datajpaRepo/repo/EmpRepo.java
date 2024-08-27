package com.datajpaRepo.repo;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.datajpaRepo.entity.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer> {

	//List<Employee> findAll(Sort sort);

}
