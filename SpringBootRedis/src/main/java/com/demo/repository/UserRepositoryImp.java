/**
 * 
 */
package com.demo.repository;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.User;

/**
 * @author manu
 *
 */
@Repository

public class UserRepositoryImp implements UserRepository{
	
	
	private RedisTemplate<String, User> redistemplet;
	
	private HashOperations hashoperations;


	public UserRepositoryImp(RedisTemplate<String, User> redistemplet) {
		
		this.redistemplet = redistemplet;
		hashoperations = redistemplet.opsForHash();
	}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		hashoperations.put("USER", user.getId(),user);
		
	}

	@Override
	public User findById(String id) {
		// TODO Auto-generated method stub
		return (User) hashoperations.get("USER", id);
	}

	@Override
	public Map<String,User> findAll() {
		// TODO Auto-generated method stub
		return hashoperations.entries("USER");
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		save(user);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		hashoperations.delete("USER", id);
	}

}
