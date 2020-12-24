package com.cpg.pixogramspring.services;

import com.cpg.pixogramspring.entities.Followers;
import com.cpg.pixogramspring.exceptions.FollowerIsNotAUserException;

public interface FollowerService {
	
	public Followers followUser(int user_id, String follower_email) throws FollowerIsNotAUserException;
	
	public void unFollowUser(int follower_id) throws FollowerIsNotAUserException;

}
