package pixogram.sprint1;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String username;
	private String password;
	private String email;
	private String gender;
	private String state;
	private String bio;

	@ManyToOne(cascade = CascadeType.ALL)
	private Role role;

	public User() {

	}

	public User(String username, String password, String email, String gender, String state, String bio, Role role) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.state = state;
		this.bio = bio;
		this.role = role;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + ", gender="
				+ gender + ", state=" + state + ", bio=" + bio + ", role=" + role + "]";
	}

}
