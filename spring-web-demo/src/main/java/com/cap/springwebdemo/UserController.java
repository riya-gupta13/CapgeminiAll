package com.cap.springwebdemo;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	UserService userService;
	
	@GetMapping("/user")
	public User getUser() {
		User user = new User("test@test", "testtest");
		return user;	
	}	
	
	@GetMapping("/users")
	public List<User> getAllUser() {
		return userRepo.findAll();
		
	}
	
	@GetMapping("/users/{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") int id) throws Exception {
		ResponseEntity<User>  re = null;
		if(true)
		throw new Exception("deliberate exception");
		System.out.println("Recieved id on path: "+ id);
		// code here to fetch user by id
		Optional<User> user = userRepo.findById(id);
		if(user.isPresent()) {
			User userFound = user.get();
			re = new ResponseEntity<>(userFound, HttpStatus.OK);
		}
		else {
			re = new ResponseEntity<>( HttpStatus.NOT_FOUND);
		}
		return re;
		
	}
	@GetMapping("/userget")
	public ResponseEntity<User> getUserByName(@RequestParam("name") String name) {
		ResponseEntity<User>  re = null;
		System.out.println(name);
		User existingUser = userRepo.findByEmail(name);
		if(existingUser == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(existingUser, HttpStatus.OK);	
	}
	
	@GetMapping("/hello")
	public String sayHello() {
		return "hello from controller" + LocalDateTime.now();		
	}
	
	@GetMapping("/userscount")
	public Long count() {
		return userRepo.countUsers();
	}
	
	@GetMapping("/usersort")
	public List<User> sortByEmail(){
		return userRepo.userSorted("riyatest");
	}
	@PostMapping("/users")
	public ResponseEntity<String> addUser(@RequestBody User user) {
		User existingUser = userRepo.findByEmail(user.getEmail());
		if(existingUser != null) {
			return new ResponseEntity<String>("User already exists!!", HttpStatus.CONFLICT);
		}
		userService.register(user);
		ResponseEntity<String> re = new ResponseEntity<>("successfully registered user!!", HttpStatus.CREATED);
		return re;
	}
	
	@PostMapping("/usersall")
	public List<User> insertUsers(@RequestBody List<User> users) {
		return userRepo.saveAll(users);
	}
	
	
	@DeleteMapping("/usersdel/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable("id") int id) {
		//ResponseEntity<String>  re = null;
		Optional<User> user = userRepo.findById(id);
		if(user.isPresent()) {
			//User foundUser=user.get();
			userRepo.deleteById(id);
			return new ResponseEntity<String>("successfully deleted!!", HttpStatus.CREATED);	
		}
		else
		return new ResponseEntity<>("User does not exists", HttpStatus.CONFLICT);
		//return re;
	}
	
	
	@PutMapping("/userupd")
	public ResponseEntity<String> updateUser(@RequestBody User userObj) {
		//User existingUser = userRepo.findByEmail(userObj.getEmail());
		Optional<User> user = userRepo.findById(userObj.getId());
		if(user.isPresent()) {
			userRepo.save(userObj);
			return new ResponseEntity<String>("User updated", HttpStatus.CREATED);
		}
		else
		return new ResponseEntity<>("User Not Found",HttpStatus.NOT_FOUND);
		
	}
	
	@PatchMapping("/usersupd")
	public ResponseEntity<String> editUser(@RequestBody User userObj) {
		//User existingUser = userRepo.findByEmail(userObj.getEmail());
		Optional<User> user = userRepo.findById(userObj.getId());
		if(user.isPresent()) {
			userRepo.save(userObj);
			return new ResponseEntity<String>("User edited", HttpStatus.CREATED);
		}
		else
		return new ResponseEntity<>("User Not Found",HttpStatus.NOT_FOUND);
		
	}
	
//	@RequestMapping(value= "{id}" , method=RequestMethod.PUT)
//	public User updateUser(@PathVariable("id") int id, @RequestBody User user) {
//		User existingUser=userRepo.getOne(id);
//		BeanUtils.copyProperties(user, existingUser);
//		return userRepo.saveAndFlush(existingUser);
//		
//	}

}