package com.cpg.pixogramspring.controllers;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
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
import org.springframework.web.multipart.MultipartFile;

import com.cpg.pixogramspring.entities.Content;
import com.cpg.pixogramspring.entities.Role;
//import com.cpg.pixogramspring.entities.Role;
import com.cpg.pixogramspring.entities.User;
import com.cpg.pixogramspring.exceptions.ValidationException;
import com.cpg.pixogramspring.repositories.ContentRepository;
import com.cpg.pixogramspring.repositories.UserRepository;
import com.cpg.pixogramspring.services.ContentService;
import com.cpg.pixogramspring.services.UserService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	UserRepository userRepository;
	@Autowired
	UserService userService;
	@Autowired
	ContentService contentService;
	@Autowired
	ContentRepository contentRepository;

	@GetMapping("/pixologin")
	@ApiOperation(value="User Login", notes="enter your email and password",response=User.class)
	public ResponseEntity<String> loginUser(@RequestParam("email") String email, @RequestParam("password") String password) {
		User registeredUser = userRepository.findByEmailAndPassword(email, password);
		if (registeredUser != null) {
			return new ResponseEntity<String>("Succesfully Logged in", HttpStatus.CREATED);
		} else
			return new ResponseEntity<>("Unsuccessful!! Wrong Email or Password", HttpStatus.NOT_FOUND);
	}
	
//.............................................................................................................//
//.....................................ADMIN METHODS...........................................................//

	@GetMapping("/pixouser/{user_id}")
	@ApiOperation(value="Finding user by id", notes="Provide an id to find user", response=User.class)
	public ResponseEntity<User> findUserById(@ApiParam(value="ID value for the user you want to retrieve", required=true)@PathVariable("user_id") int user_id) {
		ResponseEntity<User> response = null;
		System.out.println("Recieved id on path: " + user_id);
		// code here to fetch user by id
		Optional<User> user = userRepository.findById(user_id);
		if (user.isPresent()) {
			User userFound = user.get();
			response = new ResponseEntity<>(userFound, HttpStatus.OK);
		} else {
			response = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return response;
	}

	@GetMapping("/pixouser")
	@ApiOperation(value="Finding user by email", notes="Provide an email to find user", response=User.class)
	public ResponseEntity<User> findUserByEmail(@ApiParam(value="Email value for the user you want to retrieve", required=true)@RequestParam("email") String email) {
		// ResponseEntity<User> response = null;
		// System.out.println(email);
		User existingUser = userRepository.findByEmail(email);
		if (existingUser == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(existingUser, HttpStatus.OK);
	}

	@GetMapping("/pixouserall")
	@ApiOperation(value="All users", response=Iterable.class)
	public List<User> findAllUsers() {
		return userRepository.findAll();
	}

	@PostMapping("/pixouseradd")
	@ApiOperation(value="Adding user", notes="Provide all attributes to add user", response=User.class)
	public ResponseEntity<String> addUser(@RequestBody User user) throws ValidationException {
		User existingUser = userRepository.findByEmail(user.getEmail());
		if (existingUser != null) {
			return new ResponseEntity<String>("User already exists!!", HttpStatus.CONFLICT);
		}
		Role role=user.getRole();
		Role existingRole=userRepository.findRole(user.getRole().getRolename());
		if(existingRole.getRolename().equals(role.getRolename())){
			user.setRole(existingRole);
		}
		userService.addUser(user);
		ResponseEntity<String> re = new ResponseEntity<>("successfully registered user!!", HttpStatus.CREATED);
		return re;
	}

	@PostMapping("/pixousers")
	@ApiOperation(value="Adding users", notes="Provide all attributes to add user", response=User.class)
	public List<User> addUsers(@RequestBody List<User> users) {
		return userRepository.saveAll(users);
	}

	@DeleteMapping("/pixouserdel/{user_id}")
	@ApiOperation(value="Deleting user", notes="Provide id to delete user", response=User.class)
	public ResponseEntity<String> deleteUser(@ApiParam(value="ID value for the user you want to delete", required=true) @PathVariable("user_id") int user_id) {
		// ResponseEntity<String> re = null;
		Optional<User> user = userRepository.findById(user_id);
		if (user.isPresent()) {
			// User foundUser=user.get();
			userRepository.deleteById(user_id);
			return new ResponseEntity<String>("successfully deleted!!", HttpStatus.CREATED);
		} else
			return new ResponseEntity<>("User does not exists", HttpStatus.CONFLICT);
	}

	@PutMapping("/pixouserupd")
	@ApiOperation(value="Updating user", notes="Change the attributes you want to user", response=User.class)
	public ResponseEntity<String> updateUser(@RequestBody User userObj) {
		// User existingUser = userRepository.findByEmail(userObj.getEmail());
		Optional<User> user = userRepository.findById(userObj.getUser_id());
		if (user.isPresent()) {
			userRepository.save(userObj);
			return new ResponseEntity<String>("User updated", HttpStatus.CREATED);
		} else
			return new ResponseEntity<>("User Not Found", HttpStatus.NOT_FOUND);
	}
	
//.............................................................................................................//
//.....................................USER CONTENT............................................................//
	
	@PostMapping("/upload")
	@ApiOperation(value="Uploading a file", notes="Add the file and provide a caption", response=Content.class)
	public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file, @RequestParam("caption") String caption, @RequestParam("user_id") int user_id ) throws IllegalStateException, IOException {
		Content existingContent = contentRepository.findByCaption(caption);
	//	User existingUser=contentRepository.findUser(user_id);
		if (existingContent != null) {
			return new ResponseEntity<String>("Content already exists!!", HttpStatus.CONFLICT);
		}
		contentService.uploadFile(file,caption);
//		if(existingUser!=null) {
//			contentService.uploadFile(file,caption);
//		}
		ResponseEntity<String> re = new ResponseEntity<>("Successfully added!!", HttpStatus.CREATED);
		return re;
	}
	
	@PostMapping("/uploads")
	@ApiOperation(value="Uploading files", response=Content.class)
	public List<Content> addContents(@RequestBody List<Content> contents) {
		return contentRepository.saveAll(contents);
	}
	
	@GetMapping("/upload/{content_id}")
	@ApiOperation(value="Find a file by Id", notes="Provide an id to find file", response=Content.class)
	public ResponseEntity<Content> findContent(@ApiParam(value="ID value for the content you want to retrieve", required=true) @PathVariable("content_id") int content_id) {
		ResponseEntity<Content> response=null;
		Optional<Content> content=contentRepository.findById(content_id);
		if (content.isPresent()) {
			Content foundContent = content.get();
			response = new ResponseEntity<>(foundContent, HttpStatus.OK);
		} else {
			response = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return response;
	}
	
	@GetMapping("/uploadsall")
	@ApiOperation(value="View whole content", response=Content.class)
	public List<Content> allContent(Content content){
		return contentRepository.findAll();
	}
	
	@DeleteMapping("/uploaddel/{content_id}")
	//@RequestMapping(value = "/uploaddel/{content_id}", method = RequestMethod.DELETE)
	@ApiOperation(value="Deleting a file", notes="Provide an id to delete file", response=Content.class)
	public ResponseEntity<String> deleteContent(@ApiParam(value="ID value for the content you want to delete", required=true)@PathVariable("content_id") int content_id) {
		// ResponseEntity<String> re = null;
		Optional<Content> content = contentRepository.findById(content_id);
		if (content.isPresent()) {
			// User foundUser=user.get();
			contentRepository.deleteById(content_id);
			return new ResponseEntity<String>("successfully deleted!!", HttpStatus.CREATED);
		} else
			return new ResponseEntity<>("Image/video does not exists", HttpStatus.CONFLICT);
	}
	
	@PutMapping("/uploadupd")
	@ApiOperation(value="Updating info", notes="Change the attributes you want", response=Content.class)
	public ResponseEntity<String> updateContent(@RequestBody Content content) {
		// User existingUser = userRepository.findByEmail(userObj.getEmail());
		Optional<Content> contentObj = contentRepository.findById(content.getContent_id());
		if (contentObj.isPresent()) {
			contentRepository.save(content);
			return new ResponseEntity<String>("Changes updated", HttpStatus.CREATED);
		} else
			return new ResponseEntity<>("Image/Video not found", HttpStatus.NOT_FOUND);
	}	
}

//@GetMapping("/pixo")
//public User getUser() {
//	Role role=new Role("Admin");
//	User user = new User("riya","riya123", "riya13@gmail.com", "female", "punjab", "Aries", role);
//	return user;	
//}	

