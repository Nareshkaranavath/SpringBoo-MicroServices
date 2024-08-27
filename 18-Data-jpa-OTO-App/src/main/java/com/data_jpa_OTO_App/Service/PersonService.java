package com.data_jpa_OTO_App.Service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data_jpa_OTO_App.entity.PassPort;
import com.data_jpa_OTO_App.entity.Person;
import com.data_jpa_OTO_App.repo.PassPortRepo;
import com.data_jpa_OTO_App.repo.PersonRepo;

@Service
public class PersonService {
	@Autowired
	private PersonRepo personRep;
	@Autowired
	private PassPortRepo passRepo;
	
	public void getPassPort() {
		Optional<PassPort> passId = passRepo.findById(1);
	}

	public void getPerson() {
		Optional<Person> byId = personRep.findById(1);
	}

	public void savePerson() {

		Person p = new Person();
		p.setName("Naresh");
		;
		p.setGender("male");

		PassPort pp = new PassPort();
		pp.setPassportNum("JJNMK4879");
		pp.setIssueDate(LocalDate.now());
		pp.setExpireDate(LocalDate.now().plusYears(10));
		// associating person passport
		p.setPassPort(pp);
		pp.setPerson(p);
		// save data
		personRep.save(p);
		System.out.println("Record inserted .....");
	}

}
