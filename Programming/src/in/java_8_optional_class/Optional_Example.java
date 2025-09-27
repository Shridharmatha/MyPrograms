package in.java_8_optional_class;

import java.util.Optional;

class User
{
	private Profile Profile;

	public User(Profile profile) {
		super();
		Profile = profile;
	}
	
	public Profile getProfil()
	{
		return Profile;
	}
}

class Profile
{
	private String name;

	public Profile(String name) {
		super();
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
}

public class Optional_Example {
	
	public static void main(String[] args) {
		
		Profile p=new Profile("Shridhar Mathapati");
		User name=new User(p);
		
		Optional<String> uname=getProfile(name);
		System.out.println(uname.orElse("no email found"));
		
		
	}
	public static Optional<String> getProfile(User user)
	{
		return Optional.ofNullable(user)
				.map(User::getProfil)
				.map(Profile::getName);
	}

}
