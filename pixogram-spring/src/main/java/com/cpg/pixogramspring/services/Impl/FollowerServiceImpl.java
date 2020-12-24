package com.cpg.pixogramspring.services.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cpg.pixogramspring.constants.UserConstants;
import com.cpg.pixogramspring.entities.Followers;
import com.cpg.pixogramspring.entities.User;
import com.cpg.pixogramspring.exceptions.FollowerIsNotAUserException;
import com.cpg.pixogramspring.exceptions.UserNotFoundException;
import com.cpg.pixogramspring.repositories.FollowerRepository;
import com.cpg.pixogramspring.repositories.UserRepository;
import com.cpg.pixogramspring.services.FollowerService;

@Service
public class FollowerServiceImpl implements FollowerService {
	
	@Autowired
	FollowerRepository followerRepository;
	@Autowired
	UserRepository userRepository;
	
	@Override
	public Followers followUser(int user_id, String follower_email) throws FollowerIsNotAUserException {
		Optional<User> existingUser=userRepository.findById(user_id);
		User foundUser=existingUser.get();
		String user_email=foundUser.getEmail();
		User follower=userRepository.findByEmail(follower_email);
		if(existingUser.isPresent()) {
			if(follower!=null) {
//				Followers existingFollower=followerRepository.findByEmail(follower_email);
//				if(existingFollower!=null) {
//					throw new UserAlreadyExistsException("Already");
//				}
				Followers followers=new Followers(follower_email,user_email);
				followers.setUser(foundUser);
				return followerRepository.save(followers);
			}
			else {
				throw new FollowerIsNotAUserException(UserConstants.followerNotUser);
			}
		}
		else {
			throw new UserNotFoundException(UserConstants.userNotExists);
		}	
	}

	@Override
	public void unFollowUser(int follower_id) throws FollowerIsNotAUserException {
		Optional<Followers> follower=followerRepository.findById(follower_id);
		if(!follower.isPresent()) {
			throw new FollowerIsNotAUserException(UserConstants.followerNotUser);
		}
		else {
			followerRepository.deleteById(follower_id);
		}
		
	}
	
	

}
