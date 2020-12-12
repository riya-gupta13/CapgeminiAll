package pixogram.sprint1;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) throws ValidationException {
		UserRepository userRepository = new UserRepository();
		UserService userService = new UserService();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.Add User");
			System.out.println("2.Edit User");
			System.out.println("3.Delete User");
			System.out.println("4.View User");
			System.out.println("5.Login User");
			System.out.println("6.Exit");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter your username");
				String username = sc.next();
				System.out.println("Enter your password");
				String password = sc.next();
				System.out.println("Gender");
				String gender = sc.next();
				System.out.println("Enter your State");
				String state = sc.next();
				System.out.println("Enter your emailid");
				String emailid = sc.next();
				System.out.println("Enter your bio");
				String bio = sc.next();
				System.out.println("Enter your role(Admin/User)");
				String role = sc.next();
				Role role1 = new Role(role);
				User user = new User(username, password, emailid, gender, state, bio, role1);
				userService.addUser(user);
				break;

			case 2:
				System.out.println("Enter user id");
				int userid1 = sc.nextInt();
				System.out.println("Enter the email to change");
				String email1 = sc.next();
				userService.editUser(userid1, email1);
				break;

			case 3:
				System.out.println("Enter user id");
				int userid2 = sc.nextInt();
				System.out.println("Enter the email to change");
				String email2 = sc.next();
				userRepository.deleteUser(userid2, email2);
				break;

			case 4:
				System.out.println("Enter your email");
				String email3 = sc.next();
				userRepository.viewUserByEmail(email3);
				break;

			case 5:
				System.out.println("Enter your email");
				String email4 = sc.next();
				System.out.println("Enter your password");
				String pswrd3 = sc.next();
				userRepository.login(email4, pswrd3);
				break;
			case 6:
				System.out.println("exitted");
				System.exit(0);
				break;
			}
		}
	}

}
