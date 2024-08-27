package com.transaction_Data_Jpa.empRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.transaction_Data_Jpa.entity.Address;
@Repository
public interface AddressRepo extends JpaRepository<Address, Integer>{

}
