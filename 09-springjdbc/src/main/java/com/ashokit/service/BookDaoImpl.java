package com.ashokit.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowCallbackHandler;

import com.ashokit.Book;
import com.ashokit.BookDao;

public class BookDaoImpl implements BookDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void save(Book book) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO book (title, price) VALUES (?, ?)";
		jdbcTemplate.update(sql, book.getTitle(), book.getPrice());
	}

	@Override
	public Book findById(int id) {
		
		String sql= "SELECT * FROM book WHERE  id = ? ";
		 return jdbcTemplate.queryForObject(sql, new Object[]{id}, (resultSet, rowNum) -> {
	            Book book = new Book();
	            book.setId(resultSet.getInt("id"));
	            book.setTitle(resultSet.getString("title"));
	            book.setAuthor(resultSet.getString("author"));
	            // Set other fields as needed
	            return book;
	        });
	    }


	@SuppressWarnings("unchecked")
	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		String sql ="SELECT * FROM book";
	     return null;
		// return (List<Book>) jdbcTemplate.query(sql, (ResultSetExtractor<Book>) new BookDao());
	}

	@Override
	public void update(int id, int price) {
		// TODO Auto-generated method stub

	}

}