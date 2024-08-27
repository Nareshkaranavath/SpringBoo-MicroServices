package com.compositePK.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.compositePK.entity.Person;
import com.compositePK.entity.PersonPK;
import com.compositePK.repo.PersonRepo;

@Service
public class PersonService {
	@Autowired
	private PersonRepo personRepo;

	public void getPerson() {
		PersonPK pks = new PersonPK();
		pks.setPid(101);
		//pks.setPassportNum("UIJK2345Y");
		Optional<Person> byId = personRepo.findById(pks);

		if (byId.isPresent()) {
			Person person = byId.get();
			System.out.println(person);
		}else {
			System.out.println("Record not Found....");
		}
	}

	public void SavePerson() {

		PersonPK pks = new PersonPK();
		pks.setPid(101);
		pks.setPassportNum("UIJK2345Y");

		Person p = new Person();
		p.setName("Ashok");
		p.setEmail("nareshaj95@gmail.com");
		p.setGender("Male");
		p.setPersonPK(pks);

		personRepo.save(p);

		System.out.println("person data saved.....");
	}

}
