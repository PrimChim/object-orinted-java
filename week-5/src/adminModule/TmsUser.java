package adminModule;

import java.util.regex.Pattern;

public abstract class TmsUser {
	protected String username;
	protected String password;
	private String emailAddress;
	public static final String EMAIL_REGEX = "^[\\S]+@(heraldcollege\\.edu\\.np|heraldcollegekathmandu\\.com)$";

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

	public void printUserInformation() {
		System.out.println("Username = " + this.username);
		System.out.println("Password = " + this.password);

	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public abstract void login();
	
	public abstract void logout();
	
	public void setEmailAddress(String emailAddress) {
		if (Pattern.matches(EMAIL_REGEX, emailAddress)) {
			this.emailAddress = emailAddress;
		} else {
			System.out.println("Invalid email id..");
		}
	}

}
