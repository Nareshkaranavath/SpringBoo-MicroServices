package com.compositePK.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.compositePK.entity.Person;
import com.compositePK.entity.PersonPK;
@Repository
public interface PersonRepo extends JpaRepository<Person, PersonPK> {

}
