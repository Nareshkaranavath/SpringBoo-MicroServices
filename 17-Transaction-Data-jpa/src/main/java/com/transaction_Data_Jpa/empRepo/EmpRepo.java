package com.transaction_Data_Jpa.empRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.transaction_Data_Jpa.entity.Emp;
@Repository
public interface EmpRepo extends JpaRepository<Emp, Integer>{

}
