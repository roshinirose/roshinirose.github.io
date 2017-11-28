package rose;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="hire")
public class Hire {
@Column(name="username")
private String username;
@Column(name="delivery_date")
private Date d_date;
@Column(name="pickup_date")
private Date p_date;
@Column(name="delivery_address")
private String d_address;
@Column(name="pickup_address")
private String p_address;
@Column(name="stock_id")
private String s_id;
@Column(name="membership_id")
private String m_id;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public Date getD_date() {
	return d_date;
}
public void setD_date(Date d_date) {
	this.d_date = d_date;
}
public Date getP_date() {
	return p_date;
}
public void setP_date(Date p_date) {
	this.p_date = p_date;
}
public String getD_address() {
	return d_address;
}
public void setD_address(String d_address) {
	this.d_address = d_address;
}
public String getP_address() {
	return p_address;
}
public void setP_address(String p_address) {
	this.p_address = p_address;
}
public String getS_id() {
	return s_id;
}
public void setS_id(String s_id) {
	this.s_id = s_id;
}
public String getM_id() {
	return m_id;
}
public void setM_id(String m_id) {
	this.m_id = m_id;
}

}
