package org.springCore.user;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {
    private final JdbcTemplate jdbcTemplate;

    public UserDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(User user){
        var sql = "insert into users(username, password, age) vaues(? , ?, ?)";
        jdbcTemplate.update(sql, user.getUsername(), user.getPassword(), user.getAge());
    }
}
