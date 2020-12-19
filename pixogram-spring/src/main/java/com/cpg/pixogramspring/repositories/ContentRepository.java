package com.cpg.pixogramspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cpg.pixogramspring.entities.Content;
import com.cpg.pixogramspring.entities.User;

public interface ContentRepository extends JpaRepository<Content, Integer>  {
	
	public Content findByCaption(String caption);
	//public User findUser(int user_id);

}
