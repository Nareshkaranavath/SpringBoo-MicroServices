package com.data_jpa_OTM_App.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data_jpa_OTM_App.entity.Address1;
import com.data_jpa_OTM_App.entity.Emp1;
import com.data_jpa_OTM_App.repo.AddressRepo;
import com.data_jpa_OTM_App.repo.EmpRepo;

@Service
public class EmpService {
	@Autowired
	private EmpRepo empRep;
	@Autowired
	private AddressRepo addrRepo;

//address record retrieve
	public void getAddress() {
		addrRepo.findById(1);// parent and child
	}

	public void getEmp() {
		Optional<Emp1> byId = empRep.findById(1);
		if (byId.isPresent()) {
			Emp1 emp1 = byId.get();// only parent
			List<Address1> addrList = emp1.getAddrList();
			System.out.println(addrList);
		} else {
			System.out.println("Record not found");
		}
	}

	public void saveEmp() {
		Emp1 e = new Emp1();
		e.setName("Reddy");
		e.setEslaray(36000);

		Address1 addr = new Address1();
		addr.setCity("Hyd");
		addr.setState("TG");
		addr.setCountry("India");
		addr.setType("Present");
		addr.setEmp(e);

		Address1 addr1 = new Address1();
		addr1.setCity("WGL");
		addr1.setState("MH");
		addr1.setCountry("India");
		addr1.setType("Permanent");
		addr1.setEmp(e);

		List<Address1> addrList = Arrays.asList(addr, addr1);
		e.setAddrList(addrList);
		empRep.save(e);
	}

	public void DeleteEmp() {
		empRep.deleteById(1);//child + parent
	}

}
