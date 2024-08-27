package com.jdbc.connection;

import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;
import java.util.List;

public class MyDaoImpl implements MyDao {
    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<String> getData() {
        return jdbcTemplate.queryForList("SELECT name FROM employee", String.class);
    }

	@Override
	public boolean saveBook() {
		// TODO Auto-generated method stub
		return false;
	}
}
