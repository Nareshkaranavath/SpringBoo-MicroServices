package com.data_jpa_OTM_App.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.data_jpa_OTM_App.entity.Address1;
@Repository
public interface AddressRepo extends JpaRepository<Address1, Integer> {

}
