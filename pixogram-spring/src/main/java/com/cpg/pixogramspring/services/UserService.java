package com.cpg.pixogramspring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cpg.pixogramspring.entities.Role;
import com.cpg.pixogramspring.entities.User;
import com.cpg.pixogramspring.exceptions.ValidationException;
import com.cpg.pixogramspring.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;

	public UserRepository getUserRepository() {
		return userRepository;
	}

	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}	
	
	
	public void addUser(User user) throws ValidationException {
		String regex = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$).{8,20}$";
		String regex1 = "^(.+)@(.+)$";
		String pswrd = user.getPassword();
		String email = user.getEmail();
		//User userrole= valid(user);
		if (email.matches(regex1)) {
			if (pswrd.matches(regex)) {
				userRepository.save(user);
			} else {
				throw new ValidationException("Use a correct Password(minimum length 8)");
			}
		} else {
			throw new ValidationException("Use a correct Email");
		}
		
	}	
	

}
