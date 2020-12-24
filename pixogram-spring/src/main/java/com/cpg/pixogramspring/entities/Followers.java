package com.cpg.pixogramspring.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Follower's user have")
@Entity
public class Followers {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@ApiModelProperty(notes = "The unique Id of follower")
	private int follow_id;
	@ApiModelProperty(notes = "The Email Id of follower")
	private String follower__email;
	@ApiModelProperty(notes = "The email Id of user u want to follow")
	private String user_email;
	
	@ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH})
	@JoinColumn(name="user_id", referencedColumnName="user_id")
	@ApiModelProperty(notes = "Details about user")
	private User user;

	public Followers() {
		
	}
	public Followers(String follower__email,String user_email) {
		super();
		this.follower__email = follower__email;
		this.user_email=user_email;
	}

	public int getFollow_id() {
		return follow_id;
	}

	public void setFollow_id(int follow_id) {
		this.follow_id = follow_id;
	}

	public String getFollower__email() {
		return follower__email;
	}

	public void setFollower__email(String follower__email) {
		this.follower__email = follower__email;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
	
	

}
