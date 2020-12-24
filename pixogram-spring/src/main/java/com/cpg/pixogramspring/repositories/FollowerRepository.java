package com.cpg.pixogramspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cpg.pixogramspring.entities.Followers;

public interface FollowerRepository extends JpaRepository<Followers, Integer> {
	
	@Query("select f from followers where f.follower_email=!1")
	public Followers findByEmail(String follower_email);

}
