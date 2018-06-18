package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import entity.User;
import mapper.UserMapper;

public class UserDaoImpl implements UserDao{

	public final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public UserDaoImpl (JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public List<User> getAll() {
		String sql = "SELECT * FROM users"; 
		return jdbcTemplate.query(sql, new UserMapper());
	}

	@Override
	public void save(User user) {
		String sql = "INSERT INTO users (grupe, pavadinimas, kalorijos, kaina) VALUES (?, ?, ?, ?)";
		jdbcTemplate.update(sql, user.getGrupe(), user.getPavadinimas(), user.getKalorijos(), user.getKaina());
		
	}

	@Override
	public User getById(int id) {
		String sql = "SELECT * FROM users WHERE id = ?";
		return jdbcTemplate.queryForObject(sql, new UserMapper(), id);
	}

	@Override
	public void update(User user) {
		String sql = "UPDATE users SET grupe = ?, pavadinimas = ?, kalorijos = ?, kaina = ? WHERE id = ?";
		jdbcTemplate.update(sql, user.getGrupe(), user.getPavadinimas(), user.getKalorijos(), user.getKaina(), user.getId());
	}

	@Override
	public void delete(int id) {
		String sql = "DELETE FROM users WHERE id = ?";
		jdbcTemplate.update(sql, id);
	}

}
