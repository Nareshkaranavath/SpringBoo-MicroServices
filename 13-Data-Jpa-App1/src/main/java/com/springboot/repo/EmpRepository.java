package com.springboot.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springboot.entity.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer> {

	List<Employee> findByEsalaryGreaterThanEqual(double salary);

	public List<Employee> findByEname(String ename);
	
	@Query("From Employee")
	public List<Employee>getAllEmpsHQL();

}
