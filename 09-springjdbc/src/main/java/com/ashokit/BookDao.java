package com.ashokit;

import java.util.List;

public interface BookDao {
	void save(Book book);

	Book findById(int id);

	List<Book> findAll();

	void update(int id, int price);
}
