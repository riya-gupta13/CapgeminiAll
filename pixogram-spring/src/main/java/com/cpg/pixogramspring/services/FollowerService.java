package com.cpg.pixogramspring.services;

import com.cpg.pixogramspring.exceptions.NotAUserException;
import com.cpg.pixogramspring.models.Followers;

public interface FollowerService {
	

	void unFollowUser(int follower_id, int user_id) throws NotAUserException;

	Followers followUser(int user_id, String userEmail, String follower_email);

}
