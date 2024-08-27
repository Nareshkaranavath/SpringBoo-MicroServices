package com.webmvch2App.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webmvch2App.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
