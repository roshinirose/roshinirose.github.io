package rose;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_profile")
public class Userprofile {
@Id
@Column(name="username",unique=true)
private String username;
@Column(name="password")
private String password;
@Column(name="contact_no")
private String contact_number;
@Column(name="alternate_no")
private String acontact_number;
@Column(name="email_id")
private String email_address;
@Column(name="membership_id")
@GeneratedValue
private String membership_id;
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
public String getContact_number() {
	return contact_number;
}
public void setContact_number(String contact_number) {
	this.contact_number = contact_number;
}
public String getAcontact_number() {
	return acontact_number;
}
public void setAcontact_number(String acontact_number) {
	this.acontact_number = acontact_number;
}
public String getEmail_address() {
	return email_address;
}
public void setEmail_address(String email_address) {
	this.email_address = email_address;
}
public String getMembership_id() {
	return membership_id;
}
public void setMembership_id(String membership_id) {
	this.membership_id = membership_id;
}

}
