package com.data_jpa_OTM_App.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.data_jpa_OTM_App.entity.Emp1;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface EmpRepo extends JpaRepository<Emp1, Integer>{

}
