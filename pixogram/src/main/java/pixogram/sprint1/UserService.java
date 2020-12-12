package pixogram.sprint1;

//import java.io.File;

//import javax.activation.MimetypesFileTypeMap;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
//import javax.persistence.TypedQuery;

public class UserService {

	UserRepository userRepository = new UserRepository();
	private EntityManager em;

	public UserService() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		em = entityManagerFactory.createEntityManager();

	}

	// adding user, logic
	public void addUser(User user) throws ValidationException {
		String regex = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$).{8,20}$";
		String regex1 = "^(.+)@(.+)$";
		String pswrd = user.getPassword();
		String email = user.getEmail();
		// Role role = user.getRole();
		if (email.matches(regex1)) {
			if (pswrd.matches(regex)) {
				userRepository.addUser(user);
			} else {
				throw new ValidationException("Use a correct Password(minimum length 8)");
			}
		} else {
			throw new ValidationException("Use a correct Email");
		}
	}

	// making changes in user, logic
	public User editUser(int id, String email) {
		User foundUser = em.find(User.class, id);
		foundUser.setEmail(email);
		userRepository.editUser(foundUser);
		return foundUser;

	}
//.............................................................................................................//

	// editing content, logic
	public Content editContent(int ContentId, String Caption) {
		Content foundContent = em.find(Content.class, ContentId);
		foundContent.setCaption(Caption);
		userRepository.editContent(foundContent);
		return foundContent;
	}

}
