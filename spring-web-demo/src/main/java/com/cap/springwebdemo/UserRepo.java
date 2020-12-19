package com.cap.springwebdemo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User, Integer>{
	
	public User findByEmail(String email);
	
	public User findByEmailAndPassword(String email, String password);
	
	public User findByIdGreaterThan(int id);
	
	@Query("SELECT count(u) FROM User u")
	 Long countUsers();
	
	
	@Query("FROM User u WHERE u.email=?1 order by email")
	List<User> userSorted(String email);
	

}
