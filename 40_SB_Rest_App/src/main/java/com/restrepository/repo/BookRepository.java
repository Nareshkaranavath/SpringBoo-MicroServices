package com.restrepository.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.restrepository.entity.Book;

@RepositoryRestResource(path= "book")
public interface BookRepository  extends JpaRepository<Book, Integer>{

}
