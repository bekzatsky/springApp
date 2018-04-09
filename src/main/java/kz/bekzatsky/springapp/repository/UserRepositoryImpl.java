package kz.bekzatsky.springapp.repository;

import kz.bekzatsky.springapp.entity.User;
import kz.bekzatsky.springapp.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserRepositoryImpl implements UserRepository {

    @Autowired
    public JdbcTemplate jdbcTemplate;

    public List<User> getAllUsers() {
        String sql = "SELECT * FROM USER";
        return jdbcTemplate.query(sql, new UserMapper());
    }

    public void saveUser(User user) {
        String sql = "INSERT INTO USER(NAME, EMAIL, AGE) VALUES(?, ?, ?)";
        jdbcTemplate.update(sql, user.getName(), user.getEmail(), user.getAge());
    }

    public void updateUser(User user) {
        String sql = "UPDATE user SET name=?, email=?, age=? WHERE id=?";
        jdbcTemplate.update(sql, user.getName(), user.getEmail(), user.getAge(), user.getId());
    }

    public User getUserById(int id) {
        String sql = "SELECT * FROM USER WHERE ID = ?";
        return jdbcTemplate.queryForObject(sql, new UserMapper(), id);
    }

    public void deleteUserById(int id) {
        String sql = "DELETE FROM USER WHERE ID=?";
        jdbcTemplate.update(sql, id);
    }
}
