package TreeMap;
import java.util.*;

public class Contact implements Comparable<Contact>{
	private long phonenumber;
	private String name;
	private String email;
	
	Contact(long phonenumber,String name,String email)
	{
		super();
		this.phonenumber=phonenumber;
		this.name=name;
		this.email=email;
	}

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contact [phonenumber=" + phonenumber + ", name=" + name + ", email=" + email + "]";
	}

	@Override
	public int compareTo(Contact c) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(c.getName());
	}
}
